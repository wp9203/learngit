package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysInspectArchives;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.InspectArchivesException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.ComplianceDepOpService;
import com.nantian.service.InspectArchivesService;
import com.nantian.service.UserService;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.InspectArchivesVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 单位推荐管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author wp
 * @version 1.0
 */

@Trade(channel = "api", transCode = "complianceDepOp")
public class ComplianceDepOpController {
    private static Logger log= LoggerFactory.getLogger(ComplianceDepOpController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    ComplianceDepOpService complianceDepOpService;

    /**
     * 根据ID查询表中数据
     * @param context
     * @param complianceDepOpVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject ComplianceDepOpVO complianceDepOpVO)throws ComplianceDepOpException {
        try{
            List<SysComplianceDepOp> sysComplianceDepOpList = new ArrayList<>();
            List<SysComplianceDepOp> sysComplianceDepOpList1 = new ArrayList<>();
            List<Long> ids = complianceDepOpVO.getIds();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);
                SysComplianceDepOp sysComplianceDepOp = complianceDepOpService.queryById(id);
                System.out.println("sysComplianceDepOp:"+sysComplianceDepOp);
                if(sysComplianceDepOp != null){
                    sysComplianceDepOpList1.add(sysComplianceDepOp);
                }
            }
            List<SysComplianceDepOp> sysComplianceDepOpList2 = new ArrayList<>();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);
                SysCandidateInfo sysCandidateInfo = candidateInfoService.queryCandidateInfoById(id);
                System.out.println("2");
                SysComplianceDepOp sysComplianceDepOp = new SysComplianceDepOp();
                sysComplianceDepOp.setCandidateName(sysCandidateInfo.getCandidateName());
                sysComplianceDepOp.setId(sysCandidateInfo.getId());
                System.out.println("sysComplianceDepOp:"+sysComplianceDepOp);
                sysComplianceDepOpList2.add(sysComplianceDepOp);
            }
            System.out.println("sysComplianceDepOpList1:"+sysComplianceDepOpList1+"size():"+sysComplianceDepOpList1.size());
            if(sysComplianceDepOpList1.size()>0){
                for(int i =0; i<sysComplianceDepOpList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                    Long id1 = sysComplianceDepOpList1.get(i).getId();
                    for(int k = 0 ;k<sysComplianceDepOpList2.size();k++){
                        Long id2 = sysComplianceDepOpList2.get(k).getId();
                        if(id2.equals(id1)){
                            sysComplianceDepOpList2.remove(k);
                            k--;
                        }
                    }
                }
                System.out.println("集合2的长度："+sysComplianceDepOpList2.size());
                //合并两个集合 list2 与 sysInspectArchivesList;
                sysComplianceDepOpList.addAll(sysComplianceDepOpList1);
                if(sysComplianceDepOpList2.size()>0){
                    sysComplianceDepOpList.addAll(sysComplianceDepOpList2);
                }
                System.out.println("合并："+sysComplianceDepOpList);
            }else{
                sysComplianceDepOpList.addAll(sysComplianceDepOpList2);
            }
            System.out.println(sysComplianceDepOpList);
            context.setRstObject("data", sysComplianceDepOpList);
        }catch(ComplianceDepOpException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }


    }

    /**
     * 保存
     * @param context
     * @param complianceDepOpVOs
     * @throws ComplianceDepOpException
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context,@ParameterObject ComplianceDepOpVO complianceDepOpVOs)throws ComplianceDepOpException{
        System.out.println("保存");
        List<ComplianceDepOpVO> list = complianceDepOpVOs.getInfos();
        try{
            for(ComplianceDepOpVO complianceDepOpVO :list){
                complianceDepOpService.add(complianceDepOpVO);
            }
        }catch(ComplianceDepOpException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    /**
     * 提交
     * @param context
     * @param complianceDepOpVOs
     * @throws ComplianceDepOpException
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context,@ParameterObject ComplianceDepOpVO complianceDepOpVOs)throws ComplianceDepOpException{

        List<ComplianceDepOpVO> list = complianceDepOpVOs.getInfos(); //获取参数
        //2.将其保存 预防没有保存直接提交
        try{
            for(ComplianceDepOpVO complianceDepOpVO :list){
                complianceDepOpService.add(complianceDepOpVO);
            }
            //更新 sys_flow
            complianceDepOpService.updateSysFlowByUserID(list);
        }catch(ComplianceDepOpException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }






}
