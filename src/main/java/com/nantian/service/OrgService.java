package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.SysOrg;
import com.nantian.exception.AddRecordException;
import com.nantian.exception.OrgException;
import com.nantian.vo.OrgVO;

import java.util.List;

/**
 * <p>ClassName: OrgService</p>
 * <p>Description: 机构service </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface OrgService {
    /**
     * 根据机构号，获取机构信息
     * @param orgNo 机构号
     * @return 机构信息
     */
    SysOrg getOrg(String orgNo);

    /**
     * 根据机构i，获取机构信息
     * @param orgId 机构id
     * @return 机构信息
     */
    SysOrg getOrg(Long orgId);

    /**
     * 根据机构号，获取当前机构下的所有机构
     * @param orgNo 机构号
     * @return 当前机构及下属机构的信息
     */
    List<SysOrg> getSubordinateOrg(String orgNo);

    /**
     * 查询带条件的指定机构下的机构数据
     * @param parentOrgNo 指定父机构的机构号
     * @param orgNo 机构编号
     * @param orgName 机构名称
     * @param page 当前页数
     * @param limit 每页数量
     * @return 机构数据列表
     */
    Page<SysOrg> getSubordinateOrgSelective(String parentOrgNo, String orgNo, String orgName, int page, int limit);

    /**
     * 添加机构信息
     * @param orgVO 机构信息
     * @throws AddRecordException 添加记录异常
     * @throws OrgException 添加机构异常
     */
    void addOrg(OrgVO orgVO) throws AddRecordException, OrgException;

    /**
     * 删除指定id的机构信息
     * @param id 机构id
     */
    void deleteOrg(Long id);

    /**
     * 更新机构信息
     * @param orgVO 机构信息
     */
    void updateOrg(OrgVO orgVO);

    /**
     * 查询出机构树信息
     * @return 机构树信息
     */
    List<TreeDTO> queryOrgTree();

    /**
     * 查询指定机构的机构树数据
     * @param org 指定机构信息
     * @param orgs 全部的机构数据
     * @return 该机构编号的树结构
     */
    TreeDTO queryOrgTree(SysOrg org, List<SysOrg> orgs);
}
