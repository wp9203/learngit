package com.nantian.service;



import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysOutgoingInspection;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.OutGoingInspectionException;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.OutGoingInspectionVO;

import java.util.List;


public interface OutGoingInspectionService {

    /**
     * 插入数据到sys_inspect_archives
     * @param outGoingInspectionVO 需要添加的用户信息 集合
     */
    void add(OutGoingInspectionVO outGoingInspectionVO) throws OutGoingInspectionException;



    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysOutgoingInspection queryById(Long id) throws OutGoingInspectionException;



    void updateSysFlowByUserID(List<OutGoingInspectionVO> outGoingInspectionVOList)throws OutGoingInspectionException;



}
