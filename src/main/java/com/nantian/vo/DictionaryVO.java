package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;

/**
 * @PackageName:com.nantian.vo
 * @ClassName: DictionaryVO
 * @Description: 字典视图对象
 * @author: YanCheng
 * @date 1/7/2020 5:49 PM
 */
public class DictionaryVO implements Serializable {
    /**
     * 主键
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
     * 字典备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "DictionaryVO{" +
                "id=" + id +
                ", dictName='" + dictName + '\'' +
                ", dictKey='" + dictKey + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
