package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysRole;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.RoleService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.RolePermissionVO;
import com.nantian.vo.RoleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: RoleController</p>
 * <p>Description: 角色管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Extend
@Trade(channel = "api", transCode = "role")
public class RoleController {
    private static Logger log= LoggerFactory.getLogger(RoleController.class);

    @Autowired
    RoleService roleService;

    /**
     * 查询角色信息
     * @param context 应用上下文
     * @param roleNo 角色编号
     * @param name 角色名称
     * @param status 角色状态
     * @param page 当前页数
     * @param limit 每页数量
     */
    @Push
    public void query(ApplicationContext context, String roleNo, String name, String status, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }

        Page<SysRole> roles = roleService.query(roleNo, name, status, page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder(roles.getTotal(), roles.getResult());
        context.setRstObject("data", responeResult);

    }

    /**
     * 添加一个角色信息
     * @param context 应用上下文
     * @param role 角色信息
     */
    @Push
    public void add(ApplicationContext context, @ParameterObject RoleVO role) {
        if (StringUtils.isBlank(role.getRoleNo())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "角色编号不能为空");
            return;
        }

        if (StringUtils.isBlank(role.getName())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "角色名称不能为空");
            return;
        }

        roleService.addRole(role);
    }

    /**
     * 删除指定id的角色
     * @param context 应用上下文
     * @param roleId 待删除的角色id
     */
    @Push
    public void delete(ApplicationContext context, long roleId) {
        if (roleId <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "待删除的角色id不能为空");
            return;
        }

        roleService.delete(roleId);

    }

    /**
     * 更新一个角色信息
     * @param context 应用上下文
     * @param roleVO 待更新的角色信息
     */
    @Push
    public void update(ApplicationContext context, @ParameterObject RoleVO roleVO) {
        if (roleVO.getId() == null || roleVO.getId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "待更新的角色id不能为空");
            return;
        }
        roleService.update(roleVO);

    }

    /**
     * 获取角色拥有的权限，如果超过当前登录用户的权限，则不显示
     * 权限范围为登录用户的权限
     * @param context 应用上下文
     * @param roleId 角色id
     */
    @Push
    public void getRolePermission(ApplicationContext context, Long roleId) {
        if (roleId == null || roleId <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "角色id不能为空");
        }
        List<TreeDTO> trees = roleService.getRolePermission(roleId);
        context.setRstObject("data", trees);
    }

    /**
     * 更新角色的权限
     * @param rolePermissionVO 角色对应的权限的信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void updateRolePermission(ApplicationContext context, @ParameterObject RolePermissionVO rolePermissionVO) {
        if (rolePermissionVO == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "参数不全");
            return;
        }
        if (rolePermissionVO.getRoleId() == null || rolePermissionVO.getRoleId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定更新的角色id不能为空");
            return;
        }
        roleService.updateRolePermission(rolePermissionVO);
    }

    /**
     * 获取指定id的的角色信息
     * @param context 应用上下文
     * @param roleId 角色id
     */
    @Push
    public void getRole(ApplicationContext context, Long roleId) {
        if (roleId == null || roleId == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "需要编辑的角色id不能为空");
            return;
        }
        SysRole role = roleService.getRole(roleId);
        context.setRstObject("data", role);
    }

}
