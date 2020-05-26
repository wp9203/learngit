package com.nantian.shiro;

import com.nantian.constant.StatusConsts;
import com.nantian.entity.sys.SysUser;
import com.nantian.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * <p>ClassName: JdbcRealm</p>
 * <p>Description: shiro认证realm</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-25</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class JdbcRealm extends AuthenticatingRealm {
    @Autowired
    UserService userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());

        SysUser user = userService.getUser(username);
        if (user == null || StatusConsts.USER_STATUS_ABOLISH.equals(user.getStatus())) {
            throw new UnknownAccountException("帐号不存在");
        }

        if (StatusConsts.USER_STATUS_TEMP_LOCK.equals(user.getStatus()) || StatusConsts.USER_STATUS_LOCK.equals(user.getStatus())) {
            throw new LockedAccountException("帐号已被锁定");
        }
        //加盐
        ByteSource source = ByteSource.Util.bytes(username);
        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), source, getName());

    }
}
