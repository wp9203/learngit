package com.nantian.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.HashMap;
import java.util.List;

/**
 * <p>ClassName: TreeDTO</p>
 * <p>Description: 通用树状信息 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class TreeDTO {

    /**
     * 节点标题
     */
    private String title;

    /**
     * 节点唯一索引值
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 点击节点弹出新窗口对应的 url
     */
    private String href;

    /**
     * 节点是否初始展开
     */
    private Boolean spread;

    /**
     * 节点是否初始为选中状态
     */
    private Boolean checked;

    /**
     * 节点是否为禁用状态。
     */
    private Boolean disabled;

    /**
     * 节点类型
     */
    private String type;

    /**
     * 小图标
     */
    private String smallIcon;

    /**
     * 排序值
     */
    private Integer sorting;

    /**
     * 子节点
     */
    List<TreeDTO> children;

    /**
     * 扩展数据
     */
    private HashMap extendData;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getSpread() {
        return spread;
    }

    public void setSpread(Boolean spread) {
        this.spread = spread;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public void setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
    }

    public List<TreeDTO> getChildren() {
        return children;
    }

    public void setChildren(List<TreeDTO> children) {
        this.children = children;
    }

    public HashMap getExtendData() {
        return extendData;
    }

    public void setExtendData(HashMap extendData) {
        this.extendData = extendData;
    }

    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    @Override
    public String toString() {
        return "TreeDTO{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", href='" + href + '\'' +
                ", spread=" + spread +
                ", checked=" + checked +
                ", disabled=" + disabled +
                ", type='" + type + '\'' +
                ", smallIcon='" + smallIcon + '\'' +
                ", sorting=" + sorting +
                ", children=" + children +
                ", extendData=" + extendData +
                '}';
    }
}
