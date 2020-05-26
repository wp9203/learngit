package com.nantian.dto;

import com.nantian.entity.sys.SysRole;

import java.util.List;

/**
 * <p>ClassName: RoleDTO</p>
 * <p>Description: 授权角色</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class RoleDTO {
    /**
     * 当前拥有的角色
     */
    private List<SysRole> ownRoles;

    /**
     * 全部能授权的角色
     */
    private List<SysRole> allRoles;

    public List<SysRole> getOwnRoles() {
        return ownRoles;
    }

    public void setOwnRoles(List<SysRole> ownRoles) {
        this.ownRoles = ownRoles;
    }

    public List<SysRole> getAllRoles() {
        return allRoles;
    }

    public void setAllRoles(List<SysRole> allRoles) {
        this.allRoles = allRoles;
    }


    @Override
    public String toString() {
        return "RoleDTO{" +
                "ownRoles=" + ownRoles +
                ", allRoles=" + allRoles +
                '}';
    }
}
