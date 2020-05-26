package com.nantian.controller;


import com.nantian.common.util.StringUtils;

import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;

import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;


import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysUnitRecommended;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;


import com.nantian.exception.UnitRecommendedException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.FlowService;
import com.nantian.service.UnitRecommendedService;


import com.nantian.service.UserService;
import com.nantian.vo.UnitRecommendedVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.File;
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

@Trade(channel = "api", transCode = "unitRecommended")
public class UnitRecommendedController {
    private static Logger log= LoggerFactory.getLogger(UnitRecommendedController.class);

    @Autowired
    UnitRecommendedService unitRecommendedService;
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    UserService userService;

    /**
     * 新增竞聘者
     * @param context 应用上下文
     * @param unitRecommendedVOs 新增的用户信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject UnitRecommendedVO unitRecommendedVOs) throws UnitRecommendedException {
       try {
           System.out.println("unitRecommendedVOs:"+unitRecommendedVOs);
          unitRecommendedService.addUnitRecommendedInfos(unitRecommendedVOs);
        } catch (UnitRecommendedException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
       }
    }

    /**
     * 提交----先判断所有人员是否上传了材料，上传了则将sys_flow表中单位推荐的字段更新，否则所有人员都不提交，
     * @param context
     * @param unitRecommendedVOs
     * @throws UnitRecommendedException
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject UnitRecommendedVO unitRecommendedVOs)throws UnitRecommendedException{
        System.out.println("tijiao");

        List<UnitRecommendedVO> unitRecommendedVOList = unitRecommendedVOs.getInfos();
        //先判断所选人员是否都有上传单位推荐材料

        //没有先保存直接提交
        try {
            unitRecommendedService.addUnitRecommendedInfos(unitRecommendedVOs);
        } catch (UnitRecommendedException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }
        //根据ID 更新到流程表字段 unit_re_id,unit_re_result,
        unitRecommendedService.updateSysFlowByUserID(unitRecommendedVOList);


    }

    /**
     * 根据ID查询表中数据
     * @param context
     * @param unitRecommendedVOs
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject UnitRecommendedVO unitRecommendedVOs)throws UnitRecommendedException {

        List<SysUnitRecommended> sysUnitRecommendedList = new ArrayList<>();
        List<SysUnitRecommended> sysUnitRecommendedList1 = new ArrayList<>();
        List<Long> ids = unitRecommendedVOs.getIds();
        System.out.println("size():"+ids.size()+"ids:"+ids);
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysUnitRecommended sysComplianceDepOp = unitRecommendedService.queryById(id);
            System.out.println("sysComplianceDepOp:"+sysComplianceDepOp);
            if(sysComplianceDepOp != null){
                sysUnitRecommendedList1.add(sysComplianceDepOp);
            }

        }
        List<SysUnitRecommended> sysUnitRecommendedList2 = new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysCandidateInfo sysCandidateInfo = candidateInfoService.queryCandidateInfoById(id);
            System.out.println("2");
            SysUnitRecommended sysUnitRecommended = new SysUnitRecommended();
            sysUnitRecommended.setCandidateName(sysCandidateInfo.getCandidateName());
            sysUnitRecommended.setCandidateUnit(sysCandidateInfo.getUnit());
            sysUnitRecommended.setId(sysCandidateInfo.getId());
            sysUnitRecommended.setCandidatePosition(sysCandidateInfo.getPosition());
            sysUnitRecommended.setCandidatePositionLevel(sysCandidateInfo.getPositionLevel());
            System.out.println("sysUnitRecommended:"+sysUnitRecommended);
            sysUnitRecommendedList2.add(sysUnitRecommended);
        }
        System.out.println("sysUnitRecommendedList1:"+sysUnitRecommendedList1+"size():"+sysUnitRecommendedList1.size());
        if(sysUnitRecommendedList1.size()>0){
            for(int i =0; i<sysUnitRecommendedList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysUnitRecommendedList1.get(i).getId();
                for(int k = 0 ;k<sysUnitRecommendedList2.size();k++){
                    Long id2 = sysUnitRecommendedList2.get(k).getId();
                    if(id2.equals(id1)){
                        sysUnitRecommendedList2.remove(k);
                        k--;
                    }
                }
            }
            System.out.println("集合2的长度："+sysUnitRecommendedList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            sysUnitRecommendedList.addAll(sysUnitRecommendedList1);
            if(sysUnitRecommendedList2.size()>0){
                sysUnitRecommendedList.addAll(sysUnitRecommendedList2);
            }
            System.out.println("合并："+sysUnitRecommendedList);
        }else{
            sysUnitRecommendedList.addAll(sysUnitRecommendedList2);
        }
        System.out.println(sysUnitRecommendedList);
        context.setRstObject("data", sysUnitRecommendedList);

    }

}
