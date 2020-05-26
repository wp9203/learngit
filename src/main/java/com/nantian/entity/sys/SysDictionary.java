package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysDictionary implements Serializable {
    /**
     * ID主键
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典key
     */
    private String dictKey;

    /**
     * 字典value
     */
    private String dictValue;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 ID主键
     * @return ID主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 ID主键
     * @param id ID主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 字典名称
     * @return 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置 字典名称
     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取 字典key
     * @return 字典key
     */
    public String getDictKey() {
        return dictKey;
    }

    /**
     * 设置 字典key
     * @param dictKey 字典key
     */
    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    /**
     * 获取 字典value
     * @return 字典value
     */
    public String getDictValue() {
        return dictValue;
    }

    /**
     * 设置 字典value
     * @param dictValue 字典value
     */
    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * 获取 备注
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 更新时间
     * @return 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建时间
     * @return 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dictName=").append(dictName);
        sb.append(", dictKey=").append(dictKey);
        sb.append(", dictValue=").append(dictValue);
        sb.append(", remark=").append(remark);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}