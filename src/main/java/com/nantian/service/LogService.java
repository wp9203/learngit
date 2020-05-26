package com.nantian.service;

/**
 * <p>ClassName: LogService</p>
 * <p>Description: 日志service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-01</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface LogService {
    /**
     * 添加一条登录记录
     * @param username 用户名
     * @param ip 登录ip地址
     * @param equipment 登录的设备
     */
    void addLoginRecord(String username, String ip, String equipment);
}
