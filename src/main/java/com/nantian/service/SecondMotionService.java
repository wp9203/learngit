package com.nantian.service;



import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysSecondMotion;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.SecondMotionException;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.SecondMotionVO;

import java.util.List;


public interface SecondMotionService {

    /**
     * 插入数据到sys_inspect_archives
     * @param secondMotionVOs 需要添加的用户信息 集合
     */
    void add(List<SecondMotionVO> secondMotionVOs) throws SecondMotionException;

    /**
     * 提交
     * @param secondMotionVOs
     * @throws SecondMotionException
     */
    void submit(SecondMotionVO secondMotionVOs) throws SecondMotionException;

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysSecondMotion queryById(Long id) throws SecondMotionException;



    void updateSysFlowByUserID(List<SecondMotionVO> secondMotionVOList)throws SecondMotionException;

    void updateNewPositionById(SecondMotionVO secondMotionVO) throws  SecondMotionException;



}
