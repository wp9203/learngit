package com.nantian.dto;

import java.io.Serializable;

/**
 * <p>ClassName: DictionaryDTO</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class DictionaryDTO  implements Serializable {
    /**
     * 字典key
     */
    private String key;
    /**
     * 字典value
     */
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DictionaryDTO{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
