package com.nantian.controller;

import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.http.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>ClassName: AuthorizationController</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-25</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Extend
@Trade(channel = "api", transCode = "auth")
public class AuthorizationController {
    @Push
    public void unauthorized(ApplicationContext context) {
        context.setErrorMsg("403", "权限不足");
    }

}
