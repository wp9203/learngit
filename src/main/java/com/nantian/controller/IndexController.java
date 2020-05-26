package com.nantian.controller;

import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.dto.DictionaryDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.annotation.*;
import com.nantian.easytrade.core.file.FileUpload;
import com.nantian.easytrade.core.file.FileUploadConfiguration;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.easytrade.http.domain.FileModel;
import com.nantian.easytrade.http.domain.MultipartFile;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.CacheService;
import com.nantian.service.DictionaryService;
import com.nantian.service.IndexService;
import com.nantian.service.UserService;
import com.nantian.vo.UserVO;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>ClassName: IndexController</p>
 * <p>Description: 首页控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-06</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Extend
@Trade(channel = "api", transCode = "index")
public class IndexController{

    @Autowired
    IndexService indexService;

    @Autowired
    UserService userService;

    @Autowired
    CacheService cacheService;

    @Autowired
    DictionaryService dictionaryService;
    @Push
    public void queryMenu(ApplicationContext context) {
        List<TreeDTO> trees = indexService.queryCurrentUserMenu();
        context.setRstObject("data", trees);
    }

    /**
     * 获取当前登录者的个人信息
     * @param context 应用上下文
     */
    @Push
    public void getLoginUser(ApplicationContext context) {
        SysUser user = cacheService.getCurrentUserInfo();
        user.setPassword(null);
        user.setPassword(null);
        context.setRstObject("data", user);
    }


    /**
     * 更新当前登录者的个人信息
     * @param context 应用上下文
     * @param user 当前个人信息
     */
    @Push
    public void updateLoginUser(ApplicationContext context , @ParameterObject UserVO user) {
        SysUser user1 =  cacheService.getCurrentUserInfo();
        user.setId(user1.getId());
        userService.updateUser(user);
        //更新缓存中的个人用户信息
        SysUser user2 = userService.getUser(user.getUsername());
        cacheService.saveCurrentUserInfo(user2);
    }

    /**
     * 修改当前用户的密码
     * @param context 应用上下文
     * @param oldPassword 旧密码
     * @param password 密码
     */
    @Push
    public void modifyPassword(ApplicationContext context, String oldPassword, String password) {
        if (StringUtils.isBlank(oldPassword)) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_FORMAT_ERROR.getErrcode(), "旧密码不能为空");
            return;
        }
        if (StringUtils.isBlank(password)) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_FORMAT_ERROR.getErrcode(), "新密码不能为空");
            return;
        }

        SysUser user = userService.getUser(cacheService.getCurrentUserInfo().getUsername());
        ByteSource source = ByteSource.Util.bytes(user.getUsername());
        //判断旧密码是否正常
        SimpleHash oldHash = new SimpleHash(Application.HASH_ALGORITHM_NAME, oldPassword, source, Application.HASH_ITERATIONS);
        String oldPasswordHash = oldHash.toHex();
        if (!oldPasswordHash.equals(user.getPassword())) {
            context.setErrorMsg("旧密码不正确");
            return;
        }
        //将新密码进行加密
        SimpleHash hash = new SimpleHash(Application.HASH_ALGORITHM_NAME, password, source, Application.HASH_ITERATIONS);
        String newPassword = hash.toHex();

        if (newPassword.equals(oldPasswordHash)) {
            context.setErrorMsg("新密码不能和旧密码一样");
            return;
        }
        userService.modifyPassword(user.getId(), newPassword);
    }

    /**
     * 通过字典名称获取对应key-value
     * @param context
     * @param dictName
     */
    @Push
    public void getDictValue(ApplicationContext context, String dictName) {
        if (StringUtils.isBlank(dictName)) {
            context.setErrorMsg("指定的字典名称不能为空");
            return;
        }
        List<DictionaryDTO> dictionaries = dictionaryService.getDictValue(dictName);
        context.setRstObject("data", dictionaries);
    }

}
