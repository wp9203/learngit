package com.nantian.dto;

import java.util.List;

/**
 * <p>ClassName: AuthorizationDTO</p>
 * <p>Description: url权限域</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-23</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class AuthorizationDTO {
    /**
     * url路径
     */
    private String url;
    /**
     * url允许访问的角色编号
     */
    private List<String> roles;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "AuthorizationDTO{" +
                "url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
