package com.nantian.enumeration;

/**
 * <p>ClassName: ErrorCodeEnum</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-25</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public enum ErrorCodeEnum {
    /**
     * 请求成功
     */
    SUCCESS("0", "请求成功"),
    /**
     * 请求失败
     */
    ERROR("1", "请求失败"),
    /**
     * 未知错误
     */
    SYSTEM_UNKNOWN_ERROR("-1", "系统繁忙，请稍后再试...."),
    /**
     * 参数错误
     */
    PARAMETER_ERROR("A1000", "参数缺失错误"),
    /**
     * 参数约束错误
     */
    PARAMETER_FORMAT_ERROR("A1001", "参数约束错误"),
    /**
     * 查询数量超过最大限度
     */
    QUERY_OVER_ERROR("A1002", "查询数量超最大限度"),
    /**
     * 帐号不存在错误
     */
    UNKNOWN_ACCOUNT_ERROR("A1003", "帐号或密码错误"),
    /**
     * 无效的用户密码
     */
    INCORRECT_CREDENTIALS_ERROR("A1004", "帐号或密码错误"),
    /**
     * 帐号被锁
     */
    LOCKED_ACCOUNT_ERROR("A1005", "帐号或密码错误"),
    /**
     * 授权失败
     */
    AUTHORIZATION_ERROR("A1006", "帐号或密码错误"),
    /**
     * 权限不足
     */
    INSUFFICIENT_PERMISSIONS_ERROR("403", "权限不足");


    /**
     * 错误码
     */
    private String errcode;
    /**
     * 错误信息
     */
    private String errmsg;

    ErrorCodeEnum(String errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    /**
     * 获取错误码
     * @return 错误码
     */
    public String getErrcode() {
        return errcode;
    }

    /**
     * 获取错误信息
     * @return 错误信息
     */
    public String getErrmsg() {
        return errmsg;
    }
}
