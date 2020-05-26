package com.nantian.service.impl;



import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysUnitRecommended;
import com.nantian.entity.sys.SysUnitRecommendedExample;
import com.nantian.exception.UnitRecommendedException;
import com.nantian.mapper.sys.SysFlowMapper;
import com.nantian.mapper.sys.SysUnitRecommendedMapper;
import com.nantian.service.UnitRecommendedService;
import com.nantian.vo.UnitRecommendedVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class UnitRecommendedServiceImpl implements UnitRecommendedService {

    private static Logger log = LoggerFactory.getLogger(UnitRecommendedServiceImpl.class);
    @Autowired
    SysUnitRecommendedMapper sysUnitRecommendedMapper;
    @Autowired
    SysFlowMapper sysFlowMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUnitRecommendedInfos(UnitRecommendedVO unitRecommendedVOs) throws UnitRecommendedException {
        List<UnitRecommendedVO> unitRecommendedVOS = unitRecommendedVOs.getInfos();
        System.out.println("ServiceImpl");
        for(int i = 0;i<unitRecommendedVOS.size();i++){
            SysUnitRecommended sysUnitRecommended = new SysUnitRecommended();
            UnitRecommendedVO unitRecommendedVO = unitRecommendedVOS.get(i);
            sysUnitRecommended.setId(unitRecommendedVO.getId());
            sysUnitRecommended.setCandidateName(unitRecommendedVO.getCandidateName());
            sysUnitRecommended.setCandidateUnit(unitRecommendedVO.getCandidateUnit());
            sysUnitRecommended.setCandidatePosition(unitRecommendedVO.getCandidatePosition());
            sysUnitRecommended.setCandidatePositionLevel(unitRecommendedVO.getCandidatePositionLevel());
            sysUnitRecommended.setUnitRecommendedMaterial(unitRecommendedVO.getUnitRecommendedMaterial());

            //判断是否在数据已经存在该数据记录的ID
            SysUnitRecommendedExample sysUnitRecommendedExample = new SysUnitRecommendedExample();
            sysUnitRecommendedExample.createCriteria().andIdEqualTo(unitRecommendedVO.getId());
            Long count = sysUnitRecommendedMapper.countByExample(sysUnitRecommendedExample);

            if( count > 0){//存在 更新
                sysUnitRecommended.setUpdateTime(new Date());
                sysUnitRecommendedMapper.updateByPrimaryKeySelective(sysUnitRecommended);
            }else{ // 插入
                sysUnitRecommended.setCreationTime(new Date());
                sysUnitRecommendedMapper.insertSelective(sysUnitRecommended);
            }



        }
    }

    /**
     * 根据ID查询表中是否存在记录
     * @param id
     * @return
     * @throws UnitRecommendedException
     */
    @Override
    public SysUnitRecommended querySysUnitRecommended(Long id) throws UnitRecommendedException {
            return sysUnitRecommendedMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新sys_flow 表中 单位推荐字段
     * @param unitRecommendedVOList
     * @throws UnitRecommendedException
     */
    @Override
    public void updateSysFlowByUserID(List<UnitRecommendedVO> unitRecommendedVOList) throws UnitRecommendedException {

        for(int i=0;i<unitRecommendedVOList.size();i++){
            UnitRecommendedVO unitRecommendedVO = unitRecommendedVOList.get(i);
            SysUnitRecommended sysUnitRecommended = querySysUnitRecommended(unitRecommendedVO.getId());
            SysFlow sysFlow = new SysFlow();
            sysFlow.setUserid(sysUnitRecommended.getId());
            sysFlow.setStep2("2");
            sysFlow.setUnitReId(sysUnitRecommended.getId());
//            if(sysUnitRecommended.getUpdateTime()==null){
//                sysFlow.setUnitReResult(new SimpleDateFormat("yyyy-MM-dd").format(sysUnitRecommended.getCreationTime()));
//            }else{
//               sysFlow.setUnitReResult(new SimpleDateFormat("yyyy-MM-dd").format(sysUnitRecommended.getUpdateTime()));
//            }
            //系统默认该字段值为'无'
            sysFlow.setUnitReResult("有");
            sysUnitRecommendedMapper.updateByUserId(sysFlow);
        }
    }

    @Override
    public SysUnitRecommended queryById(Long id) throws UnitRecommendedException {
        SysUnitRecommendedExample example = new SysUnitRecommendedExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysUnitRecommended> sysUnitRecommendedList = sysUnitRecommendedMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysUnitRecommendedList)) {
            return null;
        }
        return sysUnitRecommendedList.get(0);
    }

    /**
     * 更新sys_unit_recommended 字段 isfinish
     * @param sysUnitRecommendedList
     * @throws UnitRecommendedException
     */
    @Override
    public void updateSysUnitRecommendedIsfinish(List<SysUnitRecommended> sysUnitRecommendedList) throws UnitRecommendedException {
        for(int i=0;i<sysUnitRecommendedList.size();i++){
            SysUnitRecommended sysUnitRecommended = sysUnitRecommendedList.get(i);
            sysUnitRecommended.setIsfinish("1");
            sysUnitRecommendedMapper.updateByPrimaryKeySelective(sysUnitRecommended);
        }
    }
}

