package com.nantian.interceptor;

import com.nantian.constant.Application;
import com.nantian.constant.CacheConsts;
import com.nantian.easytrade.annotation.Interceptor;
import com.nantian.easytrade.core.interceptor.InterceptorInterface;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.CacheService;
import com.nantian.service.PermissionService;
import com.nantian.util.RedisUtils;
import com.sun.jndi.cosnaming.CNCtx;
import org.apache.log4j.spi.ErrorCode;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: AuthInterceptor</p>
 * <p>Description: 用户权限验证拦截器 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Interceptor("auth")
public class AuthInterceptor implements InterceptorInterface {

    @Autowired
    PermissionService permissionService;

    @Override
    public boolean doIntercept() {
        ApplicationContext context = ApplicationContext.getContext();
        String url = context.getChannel() + "/" + context.getTransCode() + "/" + context.getPushName();
        boolean result = permissionService.checkPermission(url);
        if (!result) {
            context.setErrorMsg(ErrorCodeEnum.INSUFFICIENT_PERMISSIONS_ERROR.getErrcode(), ErrorCodeEnum.INSUFFICIENT_PERMISSIONS_ERROR.getErrmsg());
        }
        return result;
    }

    @Override
    public void afterComplate() {

    }
}
