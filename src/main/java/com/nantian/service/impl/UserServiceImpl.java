package com.nantian.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.RoleDTO;
import com.nantian.entity.sys.*;
import com.nantian.exception.FlowException;
import com.nantian.exception.SysCandidateInfoException;
import com.nantian.exception.SysUserException;
import com.nantian.mapper.sys.SysCandidateInfoMapper;
import com.nantian.mapper.sys.SysUserMapper;
import com.nantian.mapper.sys.SysUserRoleMapper;
import com.nantian.service.*;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.vo.CandidateInfoVo;
import com.nantian.vo.GrantVO;
import com.nantian.vo.UserVO;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>ClassName: UserServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    SysUserMapper userMapper;

    @Autowired
    OrgService orgService;

    @Autowired
    RoleService roleService;

    @Autowired
    SysUserRoleMapper userRoleMapper;

    @Autowired
    CacheService cacheService;

    @Autowired
    CandidateInfoService candidateInfoService;

    @Autowired
    SysCandidateInfoMapper sysCandidateInfoMapper;


    @Override
    public SysUser getUser(String username) {
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(username);
        List<SysUser> users = userMapper.selectByExample(userExample);

        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }

    @Override
    public Page<SysUser> query(String username, String orgNo,String candidation_name,String organization, int page, int limit) {

        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();

        if (StringUtils.isNotBlank(username)) {
            criteria.andUsernameLike(username);
        }

        if (StringUtils.isNotBlank(orgNo)) {
            criteria.andOrgNoLike(SqlUtils.allLike(orgNo));
        }
        if(StringUtils.isNotBlank(candidation_name)){
            criteria.andNameLike(candidation_name);
        }
        if(StringUtils.isNotBlank(organization)){
            criteria.andCompanyLike(organization);
        }
        //非管理员只能查询当前用户机构及下属所有的机构的用户。不能越级查询
        if (!cacheService.isAdmin()) {
            SysOrg org = cacheService.getCurrentOrgInfo();
            //获取当前机构下的所有子机构信息
            List<SysOrg> orgs = orgService.getSubordinateOrg(org.getOrgNo());

            //所有的子机构的机构号
            List<String> orgNos = new ArrayList<>();
            for (SysOrg org1 : orgs) {
                orgNos.add(org1.getOrgNo());
            }
            criteria.andOrgNoIn(orgNos);
        }


        PageHelper.startPage(page, limit);
        Page<SysUser> users = (Page<SysUser>) userMapper.selectByExample(userExample);
        return users;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Long id) {
        userMapper.deleteByPrimaryKey(id);
        //删除用户所拥有的角色
        SysUserRoleExample userRoleExample = new SysUserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(id);
        userRoleMapper.deleteByExample(userRoleExample);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUser(UserVO userVO) throws SysUserException{

        SysUser user = getSysUser(userVO);

        if(userMapper.insertSelective(user) <= 0){
            throw new SysUserException("新增用户失败");
        }

    }

    /**
     * 组装数据对象
     * @param userVO
     * @return
     */
    private SysUser getSysUser(UserVO userVO) {
        SysUser user = new SysUser();
        if(userVO.getId() == null || userVO.getId().toString().trim().equals("")){
            SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
            user.setId(snowflakeIdUtils.nextId());
            //对密码进行加密
            ByteSource source = ByteSource.Util.bytes(userVO.getUsername());
            SimpleHash hash = new SimpleHash(Application.HASH_ALGORITHM_NAME, Application.DEFAULT_PASSWORD, source, Application.HASH_ITERATIONS);
            user.setPassword(hash.toHex());
            user.setStatus(StatusConsts.USER_STATUS_NORMAL);
            user.setCreationTime(new Date());
            user.setUpdateTime(new Date());
        }else{
            user.setId(userVO.getId());
            user.setStatus(userVO.getStatus());
        }
        user.setUsername(userVO.getUsername());
        user.setAdress(userVO.getAdress());
        user.setEmail(userVO.getEmail());
        user.setIdCard(userVO.getIdCard());
        user.setZipCode(userVO.getZipCode());
        user.setOrgNo(userVO.getOrgNo());
        user.setPhoneNo(userVO.getPhoneNo());
        user.setName(userVO.getName());
        user.setLandline(userVO.getLandline());
        user.setUpdateTime(new Date());
        user.setSex(userVO.getSex());
        user.setCompany(userVO.getCompany());
        user.setPosition(userVO.getPosition());
        user.setPositionLevel(userVO.getPositionLevel());
        user.setBirthDate(userVO.getBirthDate());
        user.setPoliticsStatus(userVO.getPoliticsStatus());
        user.setEducation(userVO.getEducation());
        user.setInPositionTime(userVO.getInPositionTime());
        user.setInSamePositionTime(userVO.getInSamePositionTime());
        user.setInSamePositionLevelTime(userVO.getInSamePositionLevelTime());
        user.setIntoBankTime(userVO.getIntoBankTime());
        user.setLastYearInspectionResult(userVO.getLastYearInspectionResult());
        user.setPunishment(userVO.getPunishment());
        user.setExceptional(userVO.getExceptional());
        user.setAvoid(userVO.getAvoid());
        user.setAspiringPosition(userVO.getAspiringPosition());
        user.setAspiringPositionLevel(userVO.getAspiringPositionLevel());
        user.setRecommendationLetter(userVO.getRecommendationLetter());
        user.setNote(userVO.getNote());
        user.setUserno(userVO.getOrgNo());
        user.setOrgType(userVO.getOrgType());
        user.setOrg(userVO.getOrg());
        user.setPositionSerial(userVO.getPositionSerial());
        user.setSkillLevel(userVO.getSkillLevel());
        user.setAge(userVO.getAge());
        user.setSkillQualification(userVO.getSkillQualification());
        user.setSecondYearInspectionResult(userVO.getSecondYearInspectionResult());
        user.setThirdYearInspectionResult(userVO.getThirdYearInspectionResult());
        return user;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateUser(UserVO userVO) {
        SysUser user = getSysUser(userVO);

        userMapper.updateByPrimaryKeySelective(user);

    }

    @Override
    public RoleDTO getUserRoles(String username) {

        SysUser user = cacheService.getCurrentUserInfo();
        List<SysRole> roles = null;
        if (cacheService.isAdmin()) {
            roles = roleService.getAllRole();
        } else {
            roles = roleService.getUserRole(user.getUsername());
        }

        List<SysRole> ownRoles = roleService.getUserRole(username);

        List<SysRole> newOwnRoles = new ArrayList<>();
        for (SysRole role : ownRoles) {
            for (SysRole role1 : roles) {
                if (role.getRoleNo().equals(role1.getRoleNo())) {
                    newOwnRoles.add(role);
                    break;
                }
            }
        }
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setAllRoles(roles);
        roleDTO.setOwnRoles(newOwnRoles);
        return roleDTO;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void grant(GrantVO grantVO) {
        //删除用户旧角色
        SysUserRoleExample userRoleExample = new SysUserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(grantVO.getUserId());

        userRoleMapper.deleteByExample(userRoleExample);

        //为用户新增新角色权限
        for (Long id : grantVO.getRoleIds()) {
            System.out.println(grantVO.getRoleIds()+"&&&&&&&&&&");
            SysUserRoleKey userRoleKey = new SysUserRoleKey();
            userRoleKey.setUserId(grantVO.getUserId());
            userRoleKey.setRoleId(id);
            userRoleMapper.insert(userRoleKey);
        }

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void modifyPassword(Long id, String password) {
        SysUser newUser = new SysUser();
        newUser.setId(id);
        newUser.setPassword(password);
        newUser.setUpdateTime(new Date());
        //更新用户密码
        userMapper.updateByPrimaryKeySelective(newUser);
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void changeVo(UserVO userVO) {

        SysUserRoleExample userRoleExample = new SysUserRoleExample();

        for(int i=0;i<userVO.getRoleIds().size();i++){
            SysCandidateInfo sysCandidateInfo=new SysCandidateInfo();
            sysCandidateInfo.setId(userVO.getRoleIds().get(i));
            sysCandidateInfo.setType(userVO.getType());
            sysCandidateInfoMapper.insertInto(sysCandidateInfo);
        }
    }

    @Override
    public SysUser getUser(Long id) {
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andIdEqualTo(id);
        List<SysUser> users = userMapper.selectByExample(userExample);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }
        return users.get(0);
    }

    /**
     * 根据ID查询出 ID，name，company，position ,positionLevel
     * @param id
     * @return
     */
    @Override
    public SysUser getUserPart(Long id) {
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andIdEqualTo(id);
        List<SysUser> users = userMapper.selectByExample(userExample);
        SysUser user = new SysUser();

        user.setId(users.get(0).getId());
        user.setUsername(users.get(0).getUsername());
        user.setCompany(users.get(0).getCompany());
        user.setPosition(users.get(0).getPosition());
        user.setPositionLevel(users.get(0).getPositionLevel());


        return user;
    }

}
