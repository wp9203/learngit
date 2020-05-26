package com.nantian.service.impl;

import com.alibaba.druid.support.spring.stat.annotation.Stat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.SysOrg;
import com.nantian.entity.sys.SysOrgExample;
import com.nantian.exception.AddRecordException;
import com.nantian.exception.OrgException;
import com.nantian.mapper.sys.SysOrgMapper;
import com.nantian.service.CacheService;
import com.nantian.service.OrgService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.vo.OrgVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * <p>ClassName: OrgServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class OrgServiceImpl implements OrgService {
    private static Logger log = LoggerFactory.getLogger(OrgServiceImpl.class);

    @Autowired
    SysOrgMapper orgMapper;

    @Autowired
    CacheService cacheService;

    @Override
    public SysOrg getOrg(String orgNo) {
        SysOrgExample orgExample = new SysOrgExample();
        orgExample.createCriteria().andOrgNoEqualTo(orgNo);
        List<SysOrg> orgs = orgMapper.selectByExample(orgExample);
        if (CollectionUtils.isEmpty(orgs)) {
            return null;
        }
        return orgs.get(0);
    }

    @Override
    public SysOrg getOrg(Long orgId) {
        return orgMapper.selectByPrimaryKey(orgId);
    }

    @Override
    public List<SysOrg> getSubordinateOrg(String orgNo) {
        SysOrgExample orgExample = new SysOrgExample();
        orgExample.createCriteria().andPathLike(SqlUtils.allLike(orgNo));
        List<SysOrg> orgs = orgMapper.selectByExample(orgExample);
        return orgs;
    }

    @Override
    public Page<SysOrg> getSubordinateOrgSelective(String parentOrgNo, String orgNo, String orgName, int page, int limit) {

        if (StringUtils.isBlank(parentOrgNo)) {
            return new Page<>();
        }

        SysOrg pSysOrg = cacheService.getCurrentOrgInfo();

        PageHelper.startPage(page, limit);
        SysOrgExample orgExample = new SysOrgExample();
        SysOrgExample.Criteria criteria = orgExample.createCriteria();
        if (StringUtil.isNotEmpty(orgNo)) {
            criteria.andOrgNoLike(SqlUtils.rightLike(orgNo));
        }
        if (StringUtil.isNotEmpty(orgName)) {
            criteria.andNameLike(SqlUtils.allLike(orgName));
        }
        criteria.andPathLike(SqlUtils.allLike(pSysOrg.getOrgNo()));
        criteria.andPathLike(SqlUtils.allLike(parentOrgNo));
        return (Page<SysOrg>) orgMapper.selectByExample(orgExample);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addOrg(OrgVO orgVO) throws AddRecordException, OrgException {
        //机构号重复校验
        if(isExists(orgVO.getOrgNo())){
            throw new OrgException("机构号【"+ orgVO.getOrgNo() + "】已存在！");
        }
        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
        Long id = snowflakeIdUtils.nextId();
        String path = checkData(orgVO);
        SysOrg org = new SysOrg();
        org.setId(id);
        org.setAdress(orgVO.getAdress());
        org.setArea(orgVO.getArea());
        org.setCreationTime(new Date());
        org.setOrgLevel(orgVO.getOrgLevel());
        org.setName(orgVO.getName());
        org.setOrgNo(orgVO.getOrgNo());
        org.setParentId(orgVO.getParentId());
        org.setPath(path);
        org.setTel(orgVO.getTel());
        org.setCharger(orgVO.getCharger());
        org.setGrade(orgVO.getGrade());
        if (orgVO.getOrgLevel() != StatusConsts.ORG_LEVEL_PROVINCE && orgVO.getOrgLevel() != StatusConsts.ORG_LEVEL_PROVINCE_DEPARTMENT) {
            org.setOrgLvl2Id(orgVO.getParentId());
        }
        org.setUpdateTime(new Date());
        org.setStatus(orgVO.getStatus());
        org.setRemark(orgVO.getRemark());

        orgMapper.insertSelective(org);
    }

    /**
     * 检查机构是否已存在
     * @param orgNo
     * @return
     */
    private boolean isExists(String orgNo) {
        SysOrgExample sysOrgExample = new SysOrgExample();
        sysOrgExample.createCriteria().andOrgNoEqualTo(orgNo);
        List<SysOrg> orgs = orgMapper.selectByExample(sysOrgExample);
        if(CollectionUtils.isEmpty(orgs)){
            return false;
        }
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteOrg(Long id) {
        orgMapper.deleteByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateOrg(OrgVO orgVO) {
        //查询出当前机构的原机构信息
        SysOrg org = getOrg(orgVO.getOrgNo());
        if (org == null) {
            throw new IllegalArgumentException("找不到指定机构【" + orgVO.getOrgNo() + "】的机构信息");
        }

        SysOrg sysOrg = new SysOrg();
        sysOrg.setId(orgVO.getId());
        if (StringUtils.isNotBlank(orgVO.getName())) {
            sysOrg.setName(orgVO.getName());
        }
        if (StringUtils.isNotBlank(orgVO.getArea())) {
            sysOrg.setArea(orgVO.getArea());
        }
        if (StringUtils.isNotBlank(orgVO.getRemark())) {
            sysOrg.setRemark(orgVO.getRemark());
        }
        if (StringUtils.isNotBlank(orgVO.getAdress())) {
            sysOrg.setAdress(orgVO.getAdress());
        }
        if (StringUtils.isNotBlank(orgVO.getStatus())) {
            sysOrg.setStatus(orgVO.getStatus());
        }
        if (StringUtils.isNotBlank(orgVO.getTel())) {
            sysOrg.setTel(orgVO.getTel());
        }
        if(StringUtils.isNotBlank(orgVO.getCharger())){
            sysOrg.setCharger(orgVO.getCharger());
        }
        if(StringUtils.isNotBlank(orgVO.getGrade())){
            sysOrg.setGrade(orgVO.getGrade());
        }
        sysOrg.setUpdateTime(new Date());
        orgMapper.updateByPrimaryKeySelective(sysOrg);
    }

    @Override
    public List<TreeDTO> queryOrgTree() {
        SysOrg currentOrg = cacheService.getCurrentOrgInfo();
        //查询出根机构数据
        SysOrgExample orgExample1 = new SysOrgExample();
        orgExample1.createCriteria().andStatusEqualTo(StatusConsts.ORG_STATUS_NORMAL)
                .andPathLike(SqlUtils.allLike(currentOrg.getOrgNo()));
        List<SysOrg> allOrgs = orgMapper.selectByExample(orgExample1);

        //将所有的权限整理成树结构
        List<TreeDTO> trees = new ArrayList<>();
        TreeDTO tree = queryOrgTree(currentOrg, allOrgs);
        trees.add(tree);
        return trees;
    }

    @Override
    public TreeDTO queryOrgTree(SysOrg org, List<SysOrg> orgs) {

        TreeDTO treeDTO = new TreeDTO();
        treeDTO.setId(org.getId());
        treeDTO.setTitle(org.getName());
        HashMap map = new HashMap(1);
        map.put("orgLevel", org.getOrgLevel());
        map.put("orgNo", org.getOrgNo());
        treeDTO.setExtendData(map);
        List<TreeDTO> children = new ArrayList<>();
        //下级菜单
        List<SysOrg> lowerOrg = new ArrayList<>();
        for (SysOrg sysOrg : orgs) {
            if (sysOrg.getParentId() != null && sysOrg.getParentId().equals(org.getOrgNo())) {
                lowerOrg.add(sysOrg);
            }
        }
        //遍历所有的子菜单，递归查询所有的子菜单
        if (CollectionUtils.isNotEmpty(lowerOrg)) {
            for (SysOrg sysOrg : lowerOrg) {
                TreeDTO child = queryOrgTree(sysOrg, orgs);
                children.add(child);
            }
        }
        treeDTO.setChildren(children);

        return treeDTO;
    }

    /**
     * 检查数据合法性并返回机构路径
     * @param orgVO 机构数据
     * @return 机构路径
     * @throws IllegalArgumentException 参数约束异常
     */
    private String checkData(OrgVO orgVO) throws IllegalArgumentException {
        String path = null;
        //检查父机构数据
        if (orgVO.getOrgLevel() != 1) {
            //二级行部门、网点
            SysOrg parentOrg = getOrg(orgVO.getParentId());
            if (parentOrg == null) {
                throw new IllegalArgumentException("找不到指定的父机构号【" + orgVO.getParentId() + "】的机构信息");
            }
            //父机构等级
            int level = parentOrg.getOrgLevel();
            //机构等级
            int orgLevel = orgVO.getOrgLevel();
            //是否二级行或省行部门
            boolean isOrgCityOrDepartment = orgLevel == StatusConsts.ORG_LEVEL_PROVINCE_DEPARTMENT || orgLevel == StatusConsts.ORG_LEVEL_CITY;
            if (isOrgCityOrDepartment && level != StatusConsts.ORG_LEVEL_PROVINCE) {
                throw new IllegalArgumentException("省行部门或二级行的父机构并非省行");
            }
            //是否二级行部门或者网点
//            boolean isCityDepartmentOrCounty = orgLevel == StatusConsts.ORG_LEVEL_CITY_DEPARTMENT || orgLevel == StatusConsts.ORG_LEVEL_COUNTY;
//            if (isCityDepartmentOrCounty && level != StatusConsts.ORG_LEVEL_CITY) {
//                throw new IllegalArgumentException("二级省行部门或网点父机构并非二级行");
//            }
            //省行部门、二级行
            if (orgVO.getOrgLevel() == StatusConsts.ORG_LEVEL_PROVINCE_DEPARTMENT || orgVO.getOrgLevel() == StatusConsts.ORG_LEVEL_CITY) {
                path = orgVO.getParentId();
            } else {

                path = parentOrg.getPath();
            }
        }
        if (StringUtils.isNotBlank(path)) {
            path += "." + orgVO.getOrgNo();
        } else {
            path = orgVO.getOrgNo();
        }

        return path;
    }

}
