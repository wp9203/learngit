package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

/**
 * <p>ClassName: RoleVO</p>
 * <p>Description: 角色</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class RoleVO {

    /**
     * 编号
     */
    private Long id;

    /**
     * 角色编号
     */
    private String roleNo;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色英文名称
     */
    private String engName;

    /**
     * 状态	0不可用，1可用
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoleVO{" +
                "id=" + id +
                ", roleNo='" + roleNo + '\'' +
                ", name='" + name + '\'' +
                ", engName='" + engName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
