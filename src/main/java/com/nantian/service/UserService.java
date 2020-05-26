package com.nantian.service;


import com.github.pagehelper.Page;
import com.nantian.dto.RoleDTO;
import com.nantian.entity.sys.SysUser;
import com.nantian.exception.SysUserException;
import com.nantian.vo.GrantVO;
import com.nantian.vo.UserVO;

import java.util.List;

/**
 * <p>ClassName: UserService</p>
 * <p>Description: 用户service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface UserService {

    /**
     * 根据用户名，获取用户信息
     * @param username 用户名
     * @return 用户信息，找不到信息时，返回null
     */
    SysUser getUser(String username);

    /**
     * 分页查询
     * @param username 用户名
     * @param orgNo 机构号
     * @param page 当前第几页
     * @param limit 每页数量
     * @return 带分页的数据
     */
    Page<SysUser> query(String username, String orgNo, String candidation_name, String organization, int page, int limit);

    /**
     * 根据主键，删除指定的用户数据
     * @param id 用户主键
     */
    void delete(Long id);

    /**
     * 添加一个用户
     * @param userVO 需要添加的用户信息
     */
    void addUser(UserVO userVO) throws SysUserException;

    /**
     * 更新用户信息
     * @param userVO 需要更新的用户信息
     */
    void updateUser(UserVO userVO);


    /**
     * 获取指定用户的角色的列表
     * @param username 用户名称
     * @return 待授权的角色列表
     */
    RoleDTO getUserRoles(String username);

    /**
     * 授权用户角色
     * @param grantVO 授权信息
     */
    void grant(GrantVO grantVO);

    /**
     * 修改当前用户密码
     * @param id 用户id
     * @param password 新密码
     * @return 旧密码是否正确
     */
    void modifyPassword(Long id, String password);

    void changeVo(UserVO userVO);

    /**
     * 根据主键，查询用户数据
     * @param id 用户主键
     */
    SysUser getUser(Long id);

    /**
     * 根据ID查询出 ID，unit，company，position ,positionLevel
     * @param id
     * @return
     */
    SysUser getUserPart(Long id);

}
