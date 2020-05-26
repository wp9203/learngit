package com.nantian.controller;


import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysInspectArchives;
import com.nantian.entity.sys.SysUser;


import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.InspectArchivesException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.InspectArchivesService;
import com.nantian.service.UserService;
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

@Trade(channel = "api", transCode = "inspectArchives")
public class InspectArchivesController {
    private static Logger log= LoggerFactory.getLogger(InspectArchivesController.class);

    @Autowired
    InspectArchivesService inspectArchivesService;
    @Autowired
    CandidateInfoService candidateInfoService;

    /**
     * 根据ID查询表中数据
     * @param context
     * @param inspectArchivesVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject InspectArchivesVO inspectArchivesVO)throws InspectArchivesException{

        List<SysInspectArchives> sysInspectArchivesList = new ArrayList<>();
        List<SysInspectArchives> sysInspectArchivesList1 = new ArrayList<>();
        List<Long> ids = inspectArchivesVO.getIds();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysInspectArchives sysInspectArchives = inspectArchivesService.queryById(id);
            System.out.println("sysInspectArchives:"+sysInspectArchives);
            if(sysInspectArchives != null){
                sysInspectArchivesList1.add(sysInspectArchives);
            }

        }
        List<SysInspectArchives> sysInspectArchivesList2 = new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysCandidateInfo sysCandidateInfo = candidateInfoService.queryCandidateInfoById(id);
            System.out.println("2");
            SysInspectArchives sysInspectArchive = new SysInspectArchives();
            sysInspectArchive.setCandidateName(sysCandidateInfo.getCandidateName());
            sysInspectArchive.setId(sysCandidateInfo.getId());
            sysInspectArchive.setUnit(sysCandidateInfo.getUnit());
            sysInspectArchive.setPosition(sysCandidateInfo.getPosition());
            System.out.println("sysInspectArchive:"+sysInspectArchive);
            sysInspectArchivesList2.add(sysInspectArchive);
        }


       System.out.println("sysInspectArchivesList1:"+sysInspectArchivesList1+"size():"+sysInspectArchivesList1.size());
        if(sysInspectArchivesList1.size()>0){
            for(int i =0; i<sysInspectArchivesList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = sysInspectArchivesList1.get(i).getId();
                for(int k = 0 ;k<sysInspectArchivesList2.size();k++){
                    Long id2 = sysInspectArchivesList2.get(k).getId();
                    if(id2.equals(id1)){
                        sysInspectArchivesList2.remove(k);
                        k--;
                    }
                }
            }

            System.out.println("集合2的长度："+sysInspectArchivesList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            sysInspectArchivesList.addAll(sysInspectArchivesList1);
            if(sysInspectArchivesList2.size()>0){
                sysInspectArchivesList.addAll(sysInspectArchivesList2);
            }
            System.out.println("合并："+sysInspectArchivesList);
        }else{
            sysInspectArchivesList.addAll(sysInspectArchivesList2);

        }


        System.out.println(sysInspectArchivesList);
            context.setRstObject("data", sysInspectArchivesList);




    }


    /**
     * 新增竞聘者
     * @param context 应用上下文
     * @param inspectArchivesVOs 新增的用户信息
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject InspectArchivesVO inspectArchivesVOs) throws InspectArchivesException {
        System.out.println("进入方法");
        System.out.println("inspectArchivesVOs"+inspectArchivesVOs.getInfos().get(0));
        //1.获取前端传递的参数集合
        try{
            List<InspectArchivesVO> list = inspectArchivesVOs.getInfos();
            for(InspectArchivesVO inspectArchivesVO:list){
                inspectArchivesService.addInspectArchivesInfos(inspectArchivesVO);
            }
        }catch(InspectArchivesException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }



    }

    /**
     * 提交----先判断所有人员是否上传了材料，上传了则将sys_flow表中单位推荐的字段更新，否则所有人员都不提交，
     * @param context
     * @param inspectArchivesVOs
     * @throws InspectArchivesException
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject InspectArchivesVO inspectArchivesVOs)throws InspectArchivesException{
        System.out.println("tijiao");

        //获取前端传递的参数集合
        List<InspectArchivesVO> list = inspectArchivesVOs.getInfos();
        //2没有保存直接提交
        try{
            for(InspectArchivesVO inspectArchivesVO:list){
                inspectArchivesService.addInspectArchivesInfos(inspectArchivesVO);
            }
            //更新sys_flow
            inspectArchivesService.updateSysFlowByUserID(list);
        }catch(InspectArchivesException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }



    }


}
