package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.List;

/**
 * <p>ClassName: GrantVO</p>
 * <p>Description: 用户授权角色视图</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class GrantVO {
    /**
     * 要授权的用户id
     */
    private Long userId;

    /**
     * 要授权的角色id集合
     */
    private List<Long> roleIds;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }


    @Override
    public String toString() {
        return "GrantVO{" +
                "userId=" + userId +
                ", roleIds=" + roleIds +
                '}';
    }
}
