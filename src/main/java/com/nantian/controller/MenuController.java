package com.nantian.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.util.StringUtil;
import com.nantian.constant.Application;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.PermissionDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.constant.ConfigConsts;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysPermission;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.MenuService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.PermissionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: MenuController</p>
 * <p>Description: 权限菜单控制器 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Extend
@Trade(channel = "api", transCode = "menu")
public class MenuController {
    private static Logger log= LoggerFactory.getLogger(MenuController.class);

    @Autowired
    MenuService menuService;
    /**
     * 查询指定菜单下的所有菜单
     * @param context 应用上下文
     * @param permissionPid 父权限id
     * @param name 权限名称
     * @param page 当前页数
     * @param limit 当前页码
     */
    @Push
    public void query(ApplicationContext context,  Long permissionPid, String name, int page, int limit) {

        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }

        if (permissionPid == null || permissionPid <= 0) {
            context.setRstObject("data", ResponeResult.responeEmpty());
            return;
        }
        Page<SysPermission> permissions = menuService.query(permissionPid, name, page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder(permissions.getTotal(), permissions.getResult());
        context.setRstObject("data", responeResult);

    }

    /**
     * 查询菜单权限树信息
     * @param context 应用上下文
     */
    @Push
        public void queryTree(ApplicationContext context) {
        List<TreeDTO> trees = menuService.queryTree();
        context.setRstObject("data", trees);
    }

    /**
     * 添加一个权限信息
     * @param context 应用上下文
     * @param permissionVO 权限信息
     */
    @Push
    public void add(ApplicationContext context, @ParameterObject PermissionVO permissionVO) {
        if (permissionVO == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "待新增的权限信息不能为空");
            return;
        }
        if (StringUtil.isEmpty(permissionVO.getName())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "权限名称不能为空");
            return;
        }
        if (StringUtil.isEmpty(permissionVO.getUrl()) && !StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals(permissionVO.getType())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "权限的url不能为空");
            return;
        }
        menuService.addPermission(permissionVO);

    }

    /**
     * 删除指定id的权限信息
     * @param context 应用上下文
     * @param permissionId 菜单权限id
     */
    @Push
    public void delete(ApplicationContext context, Long permissionId) {
        if (permissionId == null || permissionId <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定的权限id不能为空");
            return;
        }

        menuService.deletePermission(permissionId);
    }

    /**
     * 更新指定id的权限信息
     * @param context 应用上下文
     * @param permissionVO 等更新的权限信息
     */
    @Push
    public void update(ApplicationContext context, @ParameterObject PermissionVO permissionVO) {
        if (permissionVO == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定更新的权限信息不能为空");
            return;
        }
        if (permissionVO.getId() == null || permissionVO.getId() <= 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定等更新的权限id不能为空");
            return;
        }
        menuService.updatePermission(permissionVO);
    }

    @Push
    public void getPermission(ApplicationContext context, Long permissionId) {
        if (permissionId == null || permissionId == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定查询的权限id不能为空");
            return;
        }
        PermissionDTO permissionDTO = menuService.getPermission(permissionId);
        context.setRstObject("data", permissionDTO);
    }
}
