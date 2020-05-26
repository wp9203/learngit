package com.nantian.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

/**
 * <p>ClassName: PermissionDTO</p>
 * <p>Description: 权限树信息 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-20</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class PermissionDTO {
    /**
     * 权限ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 权限的父ID
     */
    private Long parentId;

    /**
     * 权限的父名称
     */
    private String parentName;

    /**
     * 路径
     */
    private String path;

    /**
     * URL地址
     */
    private String url;

    /**
     * 大图标地址
     */
    private String bigIcon;

    /**
     * 小图标地址
     */
    private String smallIcon;

    /**
     * 排序
     */
    private Integer sorting;

    /**
     * 类型 1：分类，没有实际操作；2：菜单，访问时可以跳到指定的菜单页面；3:权限，菜单下的权限，例如增、删、改
     */
    private String type;

    private String hide;

    /**
     * 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     */
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBigIcon() {
        return bigIcon;
    }

    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "PermissionDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", path='" + path + '\'' +
                ", url='" + url + '\'' +
                ", bigIcon='" + bigIcon + '\'' +
                ", smallIcon='" + smallIcon + '\'' +
                ", sorting=" + sorting +
                ", type='" + type + '\'' +
                ", hide='" + hide + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
