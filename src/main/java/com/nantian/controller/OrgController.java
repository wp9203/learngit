package com.nantian.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.util.StringUtil;
import com.nantian.constant.Application;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysOrg;
import com.nantian.entity.sys.SysOrgExample;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.AddRecordException;
import com.nantian.exception.OrgException;
import com.nantian.service.OrgService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.OrgVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>ClassName: OrgController</p>
 * <p>Description: 机构管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Extend
@Trade(channel = "api", transCode = "org")
public class OrgController {

    @Autowired
    OrgService orgService;

    private static Logger log= LoggerFactory.getLogger(OrgController.class);

    /**
     * 根据条件查询机构
     * 指定父机构id。查询的机构只能在该父机构的下属机构中
     * @param context 应用上下文
     * @param parentOrgNo 父机构号
     * @param orgName 机构名称
     * @param orgNo 机构编号
     * @param page 当前页码
     * @param limit 页码数量
     */
    @Push
    public void query(ApplicationContext context, String orgName, String orgNo, String parentOrgNo, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<SysOrg> orgs = orgService.getSubordinateOrgSelective(parentOrgNo, orgNo, orgName, page, limit);

        ResponeResult responeResult = ResponeResult.responeBuilder(orgs.getTotal(), orgs);
        context.setRstObject("data", responeResult);
    }

    /**
     * 查询全部机构的机构树数据
     * @param context 应用上下文
     */
    @Push
    public void queryTree(ApplicationContext context) {
        List<TreeDTO> trees = orgService.queryOrgTree();
        context.setRstObject("data", trees);
    }

    /**
     * 添加一个机构
     * @param context 应用上下文
     * @param orgVO 待添加的机构信息
     */
    @Push
    public void add(ApplicationContext context,@ParameterObject OrgVO orgVO) {
        if (orgVO == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构数据不能为空");
            return;
        }
        if (StringUtil.isEmpty(orgVO.getOrgNo())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构编号不能为空");
            return;
        }
        if (StringUtil.isEmpty(orgVO.getName())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构名称不能为空");
            return;
        }
        if (orgVO.getOrgLevel() == null || orgVO.getOrgLevel() == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构等级不能为空");
            return;
        }
        if (orgVO.getOrgLevel() > 1 && StringUtil.isEmpty(orgVO.getParentId())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "非省行机构，父机构编号不能为空");
            return;
        }
        try {
            orgService.addOrg(orgVO);
        } catch (AddRecordException e) {
            log.error(e.getMessage(), e);
            context.setErrorMsg(e.getMessage());
        }catch(OrgException e){
            log.error(e.getMessage(), e);
            context.setErrorMsg(e.getMessage());
        }

    }

    /**
     * 删除指定的机构
     * @param context 应用上下文
     * @param id 机构id
     */
    @Push
    public void delete(ApplicationContext context, Long id) {
        if (id == null || id == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "要删除的机构id不能为空");
        }
        orgService.deleteOrg(id);
    }

    /**
     * 更新机构信息
     * @param context 应用上下文
     * @param orgVO 机构信息
     */
    @Push
    public void update(ApplicationContext context, @ParameterObject OrgVO orgVO) {
        if (orgVO == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构数据不能为空");
            return;
        }
        if (orgVO.getId() == null || orgVO.getId() == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指定更新的机构id不能为空");
            return;
        }
        orgService.updateOrg(orgVO);


    }

    /**
     * 获取指定机构的信息
     * @param context 应用上下文
     * @param orgId 机构id
     */
    @Push
    public void getOrg(ApplicationContext context, Long orgId) {
        if (orgId == null || orgId == 0) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "机构的id不能为空");
            return;
        }

        SysOrg org = orgService.getOrg(orgId);
        if (org == null) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "指不到指定的机构");
            return;
        }
        context.setRstObject("data", org);

    }
}
