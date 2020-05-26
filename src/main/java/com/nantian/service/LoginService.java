package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.entity.sys.SysLoginLog;
import com.nantian.vo.LoginLogVO; /**
 * <p>ClassName: LoginService</p>
 * <p>Description: 登录service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface LoginService {
    /**
     * 登录
     * @param username 用户帐号
     * @param password 密码
     */
    void login(String username, String password);

    /**
     * 注销用户
     */
    void logout();

    /**
     * 查询日志信息
     * @param loginLogVO
     * @param page
     * @param limit
     * @return
     */
    Page<SysLoginLog> query(LoginLogVO loginLogVO, int page, int limit);
}
