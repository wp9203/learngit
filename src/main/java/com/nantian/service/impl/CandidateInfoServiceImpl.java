package com.nantian.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.FlowException;
import com.nantian.exception.SysCandidateInfoException;
import com.nantian.mapper.sys.SysCandidateInfoMapper;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.FlowService;
import com.nantian.service.UserService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.vo.CandidateInfoVo;
import com.nantian.vo.FlowVO;
import com.nantian.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class CandidateInfoServiceImpl implements CandidateInfoService {

    private static Logger log = LoggerFactory.getLogger(CandidateInfoServiceImpl.class);

        @Autowired
        SysCandidateInfoMapper sysCandidateInfoMapper;
        @Autowired
        UserService userService;
        @Autowired
        FlowService flowService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addCandidateInfo(CandidateInfoVo candidateInfoVo) throws SysCandidateInfoException {

        SysCandidateInfo sysCandidateInfo=new SysCandidateInfo();
        if(candidateInfoVo.getId() == null || candidateInfoVo.getId().toString().trim().equals("")){

            String username=candidateInfoVo.getCandidateName();
            SysUser user = userService.getUser(username);
//            SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
//            Long id = snowflakeIdUtils.nextId();
            //根据查询结果判断 user是否为空
            if(user.getName()==null||"".equals(user.getName())) {
                return;
            }else{
                Long id=user.getId();
                sysCandidateInfo.setId(id);
            }
        }else{
            sysCandidateInfo.setId(candidateInfoVo.getId());
        }
        sysCandidateInfo.setCandidateName(candidateInfoVo.getCandidateName());
        sysCandidateInfo.setUnit(candidateInfoVo.getUnit());
        sysCandidateInfo.setPosition(candidateInfoVo.getPosition());
        sysCandidateInfo.setPositionLevel(candidateInfoVo.getPositionLevel());
        sysCandidateInfo.setCandidateType(candidateInfoVo.getCandidateType());
        sysCandidateInfo.setAdjustType(candidateInfoVo.getAdjustType());
        sysCandidateInfo.setAspiringUnit(candidateInfoVo.getAspiringUnit());
        sysCandidateInfo.setAspiringPosition(candidateInfoVo.getAspiringPosition());
        sysCandidateInfo.setAspiringPositionLevel(candidateInfoVo.getAspiringPositionLevel());
        sysCandidateInfo.setSex(candidateInfoVo.getSex());
        sysCandidateInfo.setBirthday(String.valueOf(candidateInfoVo.getBirthday()));
        sysCandidateInfo.setDepartment(candidateInfoVo.getDepartment());
        sysCandidateInfo.setOrganization(candidateInfoVo.getOrganization());
        sysCandidateInfo.setNote(candidateInfoVo.getNote());
        sysCandidateInfo.setMeetingDate(candidateInfoVo.getMeetingDate());
        sysCandidateInfo.setHost(candidateInfoVo.getHost());
        sysCandidateInfo.setDueNumber(candidateInfoVo.getDueNumber());
        sysCandidateInfo.setActualNumber(candidateInfoVo.getActualNumber());
        sysCandidateInfo.setSummaryNumber(candidateInfoVo.getSummaryNumber());
        sysCandidateInfo.setApprovalType(candidateInfoVo.getApprovalType());
        sysCandidateInfo.setReplyDate(candidateInfoVo.getReplyDate());
        sysCandidateInfo.setCandidateNumber(candidateInfoVo.getCandidateNumber());
        sysCandidateInfo.setWrittenDate(candidateInfoVo.getWrittenDate());
        sysCandidateInfo.setWrittenResult(candidateInfoVo.getWrittenResult());
        sysCandidateInfo.setWrittenRanking(candidateInfoVo.getWrittenRanking());
        sysCandidateInfo.setInterviewDate(candidateInfoVo.getInterviewDate());
        sysCandidateInfo.setInterviewResult(candidateInfoVo.getInterviewResult());
        sysCandidateInfo.setInterviewRanking(candidateInfoVo.getInterviewRanking());
        sysCandidateInfo.setThesisDate(candidateInfoVo.getThesisDate());
        sysCandidateInfo.setThesisResult(candidateInfoVo.getThesisResult());
        sysCandidateInfo.setThesisRanking(candidateInfoVo.getThesisRanking());
        sysCandidateInfo.setSynthesisResult(candidateInfoVo.getSynthesisResult());
        sysCandidateInfo.setSynthesisRanking(candidateInfoVo.getSynthesisRanking());
        sysCandidateInfo.setCreationTime(new Date());
        //民主推薦0 公开竞聘1
        sysCandidateInfo.setType(candidateInfoVo.getType());

        sysCandidateInfoMapper.insertSelective(sysCandidateInfo);
    }

    @Override
    public Page<SysCandidateInfo> query(int page, int limit) {

        SysCandidateInfoExample sysCandidateInfoExample=new SysCandidateInfoExample();
        SysCandidateInfoExample.Criteria criteria=sysCandidateInfoExample.createCriteria();

        PageHelper.startPage(page, limit);
        Page<SysCandidateInfo> sysCandidateInfos = (Page<SysCandidateInfo>) sysCandidateInfoMapper.selectByExampleX(sysCandidateInfoExample);
        return sysCandidateInfos;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Long id) {
        sysCandidateInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 组装数据对象
     * @param candidateInfoVo
     * @return
     */
    private SysCandidateInfo getSysCandidateInfo(CandidateInfoVo candidateInfoVo) {

        SysCandidateInfo sysCandidateInfo=new SysCandidateInfo();
        if(candidateInfoVo.getId() == null || candidateInfoVo.getId().toString().trim().equals("")){
            return null;
        }else{
            sysCandidateInfo.setId(candidateInfoVo.getId());
        }
        sysCandidateInfo.setCandidateName(candidateInfoVo.getCandidateName());
        sysCandidateInfo.setUnit(candidateInfoVo.getUnit());
        sysCandidateInfo.setPosition(candidateInfoVo.getPosition());
        sysCandidateInfo.setPositionLevel(candidateInfoVo.getPositionLevel());
        sysCandidateInfo.setCandidateType(candidateInfoVo.getCandidateType());
        sysCandidateInfo.setAdjustType(candidateInfoVo.getAdjustType());
        sysCandidateInfo.setAspiringUnit(candidateInfoVo.getAspiringUnit());
        sysCandidateInfo.setAspiringPosition(candidateInfoVo.getAspiringPosition());
        sysCandidateInfo.setAspiringPositionLevel(candidateInfoVo.getAspiringPositionLevel());
        sysCandidateInfo.setSex(candidateInfoVo.getSex());
        sysCandidateInfo.setBirthday(String.valueOf(candidateInfoVo.getBirthday()));
        sysCandidateInfo.setDepartment(candidateInfoVo.getDepartment());
        sysCandidateInfo.setOrganization(candidateInfoVo.getOrganization());
        sysCandidateInfo.setMeetingDate(candidateInfoVo.getMeetingDate());
        sysCandidateInfo.setHost(candidateInfoVo.getHost());
        sysCandidateInfo.setDueNumber(candidateInfoVo.getDueNumber());
        sysCandidateInfo.setActualNumber(candidateInfoVo.getActualNumber());
        sysCandidateInfo.setSummaryNumber(candidateInfoVo.getSummaryNumber());
        sysCandidateInfo.setApprovalType(candidateInfoVo.getApprovalType());
        sysCandidateInfo.setReplyDate(candidateInfoVo.getReplyDate());
        sysCandidateInfo.setCandidateNumber(candidateInfoVo.getCandidateNumber());
        sysCandidateInfo.setWrittenDate(candidateInfoVo.getWrittenDate());
        sysCandidateInfo.setWrittenResult(candidateInfoVo.getWrittenResult());
        sysCandidateInfo.setWrittenRanking(candidateInfoVo.getWrittenRanking());
        sysCandidateInfo.setInterviewDate(candidateInfoVo.getInterviewDate());
        sysCandidateInfo.setInterviewResult(candidateInfoVo.getInterviewResult());
        sysCandidateInfo.setInterviewRanking(candidateInfoVo.getInterviewRanking());
        sysCandidateInfo.setThesisDate(candidateInfoVo.getThesisDate());
        sysCandidateInfo.setThesisResult(candidateInfoVo.getThesisResult());
        sysCandidateInfo.setThesisRanking(candidateInfoVo.getThesisRanking());
        sysCandidateInfo.setSynthesisResult(candidateInfoVo.getSynthesisResult());
        sysCandidateInfo.setSynthesisRanking(candidateInfoVo.getSynthesisRanking());
        sysCandidateInfo.setUpdateTime(new Date());
        sysCandidateInfo.setType(candidateInfoVo.getType());
        return sysCandidateInfo;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(CandidateInfoVo candidateInfoVo) {
        SysCandidateInfo sysCandidateInfo=getSysCandidateInfo(candidateInfoVo);

        //流程赋值
        FlowVO flowVO=new FlowVO();
        flowVO.setUserid(sysCandidateInfo.getId());
        flowVO.setUsername(sysCandidateInfo.getCandidateName());
        flowVO.setAspiring_unit(sysCandidateInfo.getUnit());
        flowVO.setAspiring_position(sysCandidateInfo.getAspiringPosition());
        flowVO.setPositionLevel(sysCandidateInfo.getPositionLevel());
        flowVO.setAdjustType(sysCandidateInfo.getAdjustType());
        flowVO.setOrg(sysCandidateInfo.getUnit());
        flowVO.setStartDate(sysCandidateInfo.getCreationTime());
        //流程状态赋值 0 进行中 1已完成
        flowVO.setFlowStatus("0");


        UserVO userVO=new UserVO();
        userVO.setId(sysCandidateInfo.getId());
        userVO.setAspiringPosition(sysCandidateInfo.getAspiringPosition());
        userVO.setAspiringPositionLevel(sysCandidateInfo.getAspiringPositionLevel());
        //更新竞聘者信息表
        sysCandidateInfoMapper.updateByPrimaryKeySelective(sysCandidateInfo);
       //更新用户表
        userService.updateUser(userVO);
       //添加流程
        try {
            flowService.addFlow(flowVO);
        } catch (FlowException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Page<SysCandidateInfo> queryRe(int page, int limit) {

        SysCandidateInfoExample sysCandidateInfoExample=new SysCandidateInfoExample();
        SysCandidateInfoExample.Criteria criteria=sysCandidateInfoExample.createCriteria();

        PageHelper.startPage(page, limit);
        Page<SysCandidateInfo> sysCandidateInfos = (Page<SysCandidateInfo>) sysCandidateInfoMapper.selectRe(sysCandidateInfoExample);
        return sysCandidateInfos;
    }

    @Override
    public Page<SysCandidateInfo> queryCom(int page, int limit) {

        SysCandidateInfoExample sysCandidateInfoExample=new SysCandidateInfoExample();
        SysCandidateInfoExample.Criteria criteria=sysCandidateInfoExample.createCriteria();

        PageHelper.startPage(page, limit);
        Page<SysCandidateInfo> sysCandidateInfos = (Page<SysCandidateInfo>) sysCandidateInfoMapper.selectCom(sysCandidateInfoExample);
        return sysCandidateInfos;
    }

    @Override
    public void checks(SysUser user) {

        String positionSerial=user.getPositionSerial();
        // 专业技术岗
        if("专业技术岗".equals(user.getPositionSerial())){
            //专业技术三级任职条件
            if("0".equals(user.getSkillLevel())){
               if("7".equals(user.getPositionLevel())){

               }

            }
            //专业技术四级任职条件
            if("1".equals(user.getPositionSerial())){

            }
            //专业技术五级任职条件
            if("2".equals(user.getPositionSerial())){

            }
            //专业技术六级任职条件
            if("6".equals(user.getPositionSerial())){

            }

        }


        // 管理岗位职务
        else{

        }
    }
    @Override
    public SysCandidateInfo queryCandidateInfoById(Long id) {

        List<SysCandidateInfo> sysCandidateInfoList =sysCandidateInfoMapper.queryCandidateInfoById(id);
        if (CollectionUtils.isEmpty(sysCandidateInfoList)) {
            return null;
        }
        return sysCandidateInfoList.get(0);

    }

}

