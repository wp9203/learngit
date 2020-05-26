package com.nantian.util;

import com.nantian.common.util.StringUtils;

/**
 * <p>ClassName: LikeUtils</p>
 * <p>Description: sql工具类</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-18</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class SqlUtils {
    /**
     * 根据传进来的值，拼上左模糊"%"符号
     * @param value 需要模糊查询的值
     * @return 拼装后的值
     */
    public static String leftLike(String value) {
        if (StringUtils.isBlank(value)) {
            return "";
        }
        return "%" + value;
    }

    /**
     * 根据传进来的值，拼上右模糊"%"符号
     * @param value 需要模糊查询的值
     * @return 拼装后的值
     */
    public static String rightLike(String value) {
        if (StringUtils.isBlank(value)) {
            return "";
        }
        return value + "%";
    }

    /**
     * 根据传进来的值，拼上左右模糊"%"符号
     * @param value 需要模糊查询的值
     * @return 拼装后的值
     */
    public static String allLike(String value) {
        if (StringUtils.isBlank(value)) {
            return "";
        }
        return "%" + value + "%";
    }

}
