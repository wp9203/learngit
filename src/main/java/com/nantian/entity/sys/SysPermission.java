package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysPermission implements Serializable {
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
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long parentId;

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
     * 类型.1分类，2菜单，3操作
     */
    private String type;

    /**
     * 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     */
    private String status;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 创建时间	审计字段
     */
    private Date creationTime;

    /**
     * 更新时间	审计字段
     */
    private Date updateTime;

    /**
     * 是否隐藏，1是，0否
     */
    private String hide;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 权限ID
     * @return 权限ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 权限ID
     * @param id 权限ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 名称
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 权限的父ID
     * @return 权限的父ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 权限的父ID
     * @param parentId 权限的父ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 路径
     * @return 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置 路径
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取 URL地址
     * @return URL地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 URL地址
     * @param url URL地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取 大图标地址
     * @return 大图标地址
     */
    public String getBigIcon() {
        return bigIcon;
    }

    /**
     * 设置 大图标地址
     * @param bigIcon 大图标地址
     */
    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon;
    }

    /**
     * 获取 小图标地址
     * @return 小图标地址
     */
    public String getSmallIcon() {
        return smallIcon;
    }

    /**
     * 设置 小图标地址
     * @param smallIcon 小图标地址
     */
    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    /**
     * 获取 排序
     * @return 排序
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * 设置 排序
     * @param sorting 排序
     */
    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    /**
     * 获取 类型.1分类，2菜单，3操作
     * @return 类型.1分类，2菜单，3操作
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 类型.1分类，2菜单，3操作
     * @param type 类型.1分类，2菜单，3操作
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     * @return 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     * @param status 权限状态	0:不可用；1可用；当置0时，该权限下的所有子权限均不可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取 扩展字段1
     * @return 扩展字段1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * 设置 扩展字段1
     * @param extend1 扩展字段1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * 获取 扩展字段2
     * @return 扩展字段2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * 设置 扩展字段2
     * @param extend2 扩展字段2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * 获取 创建时间	审计字段
     * @return 创建时间	审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间	审计字段
     * @param creationTime 创建时间	审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 更新时间	审计字段
     * @return 更新时间	审计字段
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间	审计字段
     * @param updateTime 更新时间	审计字段
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 是否隐藏，1是，0否
     * @return 是否隐藏，1是，0否
     */
    public String getHide() {
        return hide;
    }

    /**
     * 设置 是否隐藏，1是，0否
     * @param hide 是否隐藏，1是，0否
     */
    public void setHide(String hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", path=").append(path);
        sb.append(", url=").append(url);
        sb.append(", bigIcon=").append(bigIcon);
        sb.append(", smallIcon=").append(smallIcon);
        sb.append(", sorting=").append(sorting);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", hide=").append(hide);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}