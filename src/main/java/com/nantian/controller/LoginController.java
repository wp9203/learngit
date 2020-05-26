package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.easytrade.annotation.*;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysLoginLog;
import com.nantian.entity.sys.SysOperatLog;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.CacheService;
import com.nantian.service.LogService;
import com.nantian.service.LoginService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.LoginLogVO;
import com.nantian.vo.OperatLogVO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


/**
 * <p>ClassName: LoginController</p>
 * <p>Description: 登录控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-25</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Trade(channel = "api", transCode = "login")
public class LoginController {
    private static Logger log= LoggerFactory.getLogger(LoginController.class);
    /**
     * 两小时的秒数
     */
    private static int TWO_HOURS = 2 * 60 * 60;
    @Autowired
    LoginService loginService;

    @Autowired
    CacheService cacheService;

    @Autowired
    LogService logService;

    @Push("login")
    public void login(ApplicationContext context, String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), ErrorCodeEnum.PARAMETER_ERROR.getErrmsg());
            return;
        }
        try {
            loginService.login(username, password);
            SysUser user = cacheService.getCurrentUserInfo();
            //记录登录日志
            logService.addLoginRecord(username, context.getIp(), "browser");
            //将用户名缓存到cookie中
            Cookie userCookie=new Cookie("username", URLEncoder.encode(user.getName(), "UTF-8"));
            userCookie.setMaxAge(TWO_HOURS);
            userCookie.setPath("/");
            context.getRespone().addCookie(userCookie);
        } catch (UnknownAccountException e) {
            context.setErrorMsg(ErrorCodeEnum.UNKNOWN_ACCOUNT_ERROR.getErrcode(), ErrorCodeEnum.AUTHORIZATION_ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        } catch (IncorrectCredentialsException e) {
            context.setErrorMsg(ErrorCodeEnum.INCORRECT_CREDENTIALS_ERROR.getErrcode(), ErrorCodeEnum.INCORRECT_CREDENTIALS_ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        } catch (LockedAccountException e) {
            context.setErrorMsg(ErrorCodeEnum.LOCKED_ACCOUNT_ERROR.getErrcode(), ErrorCodeEnum.LOCKED_ACCOUNT_ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        } catch (AuthenticationException e) {
            context.setErrorMsg(ErrorCodeEnum.INCORRECT_CREDENTIALS_ERROR.getErrcode(), ErrorCodeEnum.INCORRECT_CREDENTIALS_ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        } catch (AuthorizationException e) {
            context.setErrorMsg(ErrorCodeEnum.AUTHORIZATION_ERROR.getErrcode(), ErrorCodeEnum.AUTHORIZATION_ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            context.setErrorMsg("系统出错了");
            log.error(e.getMessage(), e);
        }
    }

//    @InterceptorStack({"auth", "operat"})
    @Push("logout")
    public void logout(ApplicationContext context) {
        loginService.logout();
        context.setMsg("退出成功");
    }
    @InterceptorStack({"auth", "operat"})
    @Push("query")
    public void query(ApplicationContext context, String username, String ipAddress, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg (ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode (), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg ());
            return;
        }
        LoginLogVO loginLogVO = new LoginLogVO ();
        if (username != null) {
            loginLogVO.setUsername (username);
        }
        if (ipAddress != null) {
            loginLogVO.setIpAddress (ipAddress);
        }
        Page<SysLoginLog> sysOperatLogs = loginService.query (loginLogVO , page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder (sysOperatLogs.getTotal (), sysOperatLogs.getResult ());

        context.setRstObject ("data", responeResult);
    }
}
