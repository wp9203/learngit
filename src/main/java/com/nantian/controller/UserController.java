package com.nantian.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.dto.RoleDTO;
import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysRole;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.SysUserException;
import com.nantian.service.UserService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.CandidateInfoVo;
import com.nantian.vo.FlowVO;
import com.nantian.vo.GrantVO;
import com.nantian.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * <p>ClassName: UserController</p>
 * <p>Description: 用户管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
//@Extend
@Trade(channel = "api", transCode = "user")
public class UserController {
    private static Logger log= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /**
     * 查询用户
     * 只能查询当前用户机构及下属机构的用户信息
     * @param context 应用上下文
     * @param username 用户名称
     * @param orgNo 机构编号
     * @param candidation_name 姓名（name）
     * @param organization 所属机构（company）  民主推荐选择人员时调用参数
     * @param page 当前页数
     * @param limit 每页数量
     */
    @Push
    public void query(ApplicationContext context, String username, String orgNo,String candidation_name,String organization,  int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }

        Page<SysUser> users = userService.query(username, orgNo,candidation_name,organization,page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder(users.getTotal(), users.getResult());

        context.setRstObject("data", responeResult);
    }
    @Push
    public void getUser(ApplicationContext context, String username) {
        if (StringUtils.isBlank(username)) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "要查询的用户id不能为空");
            return;
        }
        SysUser user = userService.getUser(username);
        user.setIdCard(null);
        user.setPassword(null);
        context.setRstObject("data", user);
    }


    /**
     * 新增一个用户
     * @param context 应用上下文
     * @param user 新增的用户信息
     */
    @Push
    public void add(ApplicationContext context, @ParameterObject UserVO user) {
        if (StringUtils.isBlank(user.getUsername())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "用户名不能为空");
            return;
        }

        if (StringUtils.isBlank(user.getOrgNo())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "用户所属机构不能为空");
            return;
        }
        try {
            userService.addUser(user);
        } catch (SysUserException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }
    }

    /**
     * 删除用户
     * @param context 应用上下文
     * @param id 指定的用户id
     */
    @Push
    public void delete(ApplicationContext context, Long id) {
        if (id == null || id <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "用户id不能为空");
            return;
        }
        userService.delete(id);
    }

    /**
     * 更新用户信息
     * @param context 应用上下文
     * @param user 需要更新的用户信息
     */
    @Push
    public void update(ApplicationContext context , @ParameterObject UserVO user) {
        if (user.getId() == null || user.getId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "需要更新的用户id不能为空");
            return;
        }
        userService.updateUser(user);
    }


    /**
     * 获取可授权的角色列表
     * 用户授权角色，只能授权当前用户拥有的角色
     * @param context 应用上下文
     * @param username 待授权的用户名称
     */
    @Push
    public void getUserRoles(ApplicationContext context, String username) {
        RoleDTO roleDTO = userService.getUserRoles(username);

        List<Map<String, Object>> list = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(roleDTO.getAllRoles())) {
            for (SysRole  role : roleDTO.getAllRoles()) {
                Map<String, Object> map = new HashMap<>(2);
                map.put("id",  String.valueOf(role.getId()));
                map.put("name", role.getName());
                list.add(map);
            }
        }
        List<Map<String, Object>> ownList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(roleDTO.getOwnRoles())) {
            for (SysRole  role : roleDTO.getOwnRoles()) {
                Map<String, Object> map = new HashMap<>(2);
                map.put("id",  String.valueOf(role.getId()));
                map.put("name", role.getName());
                ownList.add(map);
            }
        }

        Map<String, Object> map = new HashMap<>(2);
        map.put("roles", list);
        map.put("ownRoles", ownList);

        context.setRstObject("data", map);
    }

    /**
     * 授权
     * 授权用户指定的角色
     * @param context 应用上下文
     * @param grantVO 待授权的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void grant(ApplicationContext context, @ParameterObject GrantVO grantVO) {
        if (grantVO.getUserId() == null || grantVO.getUserId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "要授权的用户id不能为空");
            return;
        }
        userService.grant(grantVO);
    }

    @Push(requestFormat = ParamFormatEnum.JSON)
    public void addCandidateInfo(ApplicationContext context,@ParameterObject UserVO userVO){

//        if (userVO.getId() == null || userVO.getId() <= 0) {
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "添加的用户id不能为空");
//            return;
//        }
        userService.changeVo(userVO);
    }

    /**
     * 根据ID查询出 ID，name，company，position ,positionLevel
     * @param context
     * @param userVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject UserVO userVO){
        List<SysUser> users = new ArrayList<>();
        List<Long> ids = userVO.getRoleIds();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysUser user = userService.getUser(id);
            users.add(user);
        }
        System.out.println("users:"+users);
        context.setRstObject("data", users);
    }

}
