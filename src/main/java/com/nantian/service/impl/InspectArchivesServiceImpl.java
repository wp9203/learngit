package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysInspectArchives;
import com.nantian.entity.sys.SysInspectArchivesExample;
import com.nantian.exception.InspectArchivesException;
import com.nantian.mapper.sys.SysInspectArchivesMapper;
import com.nantian.service.InspectArchivesService;
import com.nantian.vo.InspectArchivesVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class InspectArchivesServiceImpl implements InspectArchivesService {

    private static Logger log = LoggerFactory.getLogger(InspectArchivesServiceImpl.class);

        @Autowired
        SysInspectArchivesMapper sysInspectArchivesMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addInspectArchivesInfos(InspectArchivesVO inspectArchivesVO) throws InspectArchivesException {
        SysInspectArchives sysInspectArchives = new SysInspectArchives();
        sysInspectArchives.setId(inspectArchivesVO.getId());
        sysInspectArchives.setCandidateName(inspectArchivesVO.getCandidateName());
        sysInspectArchives.setUnit(inspectArchivesVO.getUnit());
        sysInspectArchives.setPosition(inspectArchivesVO.getPosition());
        sysInspectArchives.setInspectTime(inspectArchivesVO.getInspectTime());
        sysInspectArchives.setInspectRecord(inspectArchivesVO.getInspectRecord());
        sysInspectArchives.setInspectProblem(inspectArchivesVO.getInspectProblem());
        sysInspectArchives.setReviewIdentified(inspectArchivesVO.getReviewIdentified());
        //判断是否在数据已经存在该数据记录的ID
        SysInspectArchivesExample sysInspectArchivesExample = new SysInspectArchivesExample();
        sysInspectArchivesExample.createCriteria().andIdEqualTo(inspectArchivesVO.getId());
        Long count = sysInspectArchivesMapper.countByExample(sysInspectArchivesExample);
        if(count >0){//更新
            sysInspectArchives.setUpdateTime(new Date());
            sysInspectArchivesMapper.updateByPrimaryKeySelective(sysInspectArchives);
        }else {//插入
            sysInspectArchives.setCreationTime(new Date());

            sysInspectArchivesMapper.insertSelective(sysInspectArchives);
        }

    }

    /**
     * 提交
     * @param inspectArchivesVO
     * @throws InspectArchivesException
     */
    @Override
    public void SubmitInspectArchives(InspectArchivesVO inspectArchivesVO) throws InspectArchivesException {
        //① 先判断该记录是否已经保存在档案表中
        Long id = inspectArchivesVO.getId();
        SysInspectArchivesExample sysInspectArchivesExample = new SysInspectArchivesExample();
        sysInspectArchivesExample.createCriteria().andIdEqualTo(inspectArchivesVO.getId());
        Long count = sysInspectArchivesMapper.countByExample(sysInspectArchivesExample);
        if(count < 1){
            SysInspectArchives sysInspectArchives = new SysInspectArchives();
            sysInspectArchives.setId(inspectArchivesVO.getId());
            sysInspectArchives.setCandidateName(inspectArchivesVO.getCandidateName());
            sysInspectArchives.setUnit(inspectArchivesVO.getUnit());
            sysInspectArchives.setPosition(inspectArchivesVO.getPosition());
            sysInspectArchives.setInspectTime(inspectArchivesVO.getInspectTime());
            sysInspectArchives.setInspectRecord(inspectArchivesVO.getInspectRecord());
            sysInspectArchives.setInspectProblem(inspectArchivesVO.getInspectProblem());
            sysInspectArchives.setReviewIdentified(inspectArchivesVO.getReviewIdentified());
            sysInspectArchives.setCreationTime(new Date());
            sysInspectArchivesMapper.insertSelective(sysInspectArchives);
        }


    }

    /**
     * 根据主键ID 查询表中是否存在该记录
     * @param id
     * @return
     */
    @Override
    public SysInspectArchives queryById(Long id) throws InspectArchivesException{
        SysInspectArchivesExample example = new SysInspectArchivesExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysInspectArchives> inspectArchivesList = sysInspectArchivesMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(inspectArchivesList)) {
            return null;
        }
        return inspectArchivesList.get(0);


    }

    @Override
    public SysInspectArchives querySysInspectArchives(Long id)throws InspectArchivesException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysInspectArchivesMapper.selectByPrimaryKey(id);
    }
    /**
     * 更新sys_flow 表中
     * @param inspectArchivesVOList
     * @throws InspectArchivesException
     */
    @Override
    public void updateSysFlowByUserID(List<InspectArchivesVO> inspectArchivesVOList)throws InspectArchivesException {
        for(int i=0;i<inspectArchivesVOList.size();i++){
            SysInspectArchives sysInspectArchives = querySysInspectArchives(inspectArchivesVOList.get(i).getId());
            SysFlow sysFlow = new SysFlow();
            sysFlow.setUserid(sysInspectArchives.getId());
            sysFlow.setStep6("6");
            sysFlow.setInspectArchivesId(sysInspectArchives.getId());
//            if(sysInspectArchives.getUpdateTime()==null){
//                sysFlow.setInspectArchivesResult(new SimpleDateFormat("yyyy-MM-dd").format(sysInspectArchives.getCreationTime()));
//            }else{
//                sysFlow.setInspectArchivesResult(new SimpleDateFormat("yyyy-MM-dd").format(sysInspectArchives.getUpdateTime()));
//            }
            //首页显示核查时间
            sysFlow.setInspectArchivesResult(new SimpleDateFormat("yyyy-MM-dd").format(sysInspectArchives.getInspectTime()));

            sysInspectArchivesMapper.updateByUserId(sysFlow);
        }
    }


}

