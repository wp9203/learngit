package com.nantian.constant;

/**
 * <p>ClassName: StatusConsts</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-01-08</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class StatusConsts {

    /**
     * 用户状态 - 废止
     */
    public static String USER_STATUS_ABOLISH = "0";

    /**
     * 用户状态 - 正常
     */
    public static String USER_STATUS_NORMAL = "1";

    /**
     * 用户状态 - 临时锁定
     */
    public static String USER_STATUS_TEMP_LOCK = "2";

    /**
     * 用户状态 - 永久锁定
     */
    public static String USER_STATUS_LOCK = "3";

    /**
     * 角色状态 - 废止
     */
    public static String ROLE_STATUS_ABOLISH = "0";

    /**
     * 角色状态 - 正常
     */
    public static String ROLE_STATUS_NORMAL = "1";

    /**
     * 权限状态 - 正常
     */
    public static String PERMISSION_STATUS_NORMAL = "1";

    /**
     * 权限状态 - 废止
     */
    public static String PERMISSION_STATUS_ABOLISH = "0";

    /**
     * 权限类型 - 分类
     */
    public static String PERMISSION_TYPE_CLASSIFICATION = "1";

    /**
     * 权限类型 - 菜单
     */
    public static String PERMISSION_TYPE_MENU = "2";

    /**
     * 权限类型 - 操作
     */
    public static String PERMISSION_TYPE_OPERATION = "3";

    /**
     * 权限是否隐藏 - 是
     */
    public static String PERMISSION_HIDE = "1";

    /**
     * 权限是否隐藏 - 否
     */
    public static String PERMISSION_SHOW = "0";

    /**
     * 机构状态 - 正常
     */
    public static String ORG_STATUS_NORMAL = "1";

    /**
     * 机构状态 - 废止
     */
    public static String ORG_STATUS_ABOLISH = "0";

    /**
     * 机构等级 - 省行
     */
    public static int ORG_LEVEL_PROVINCE = 1;

    /**
     * 机构等级 - 省行部门
     */
    public static int ORG_LEVEL_PROVINCE_DEPARTMENT = 2;

    /**
     * 机构等级 - 二级行
     */
    public static int ORG_LEVEL_CITY = 3;

    /**
     * 机构等级 - 二级行部门
     */
    public static int ORG_LEVEL_CITY_DEPARTMENT = 4;

    /**
     * 机构等级 - 网点
     */
    public static int ORG_LEVEL_COUNTY = 5;

}
