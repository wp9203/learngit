package com.nantian.service;



import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysInspectArchives;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.InspectArchivesException;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.InspectArchivesVO;

import java.util.List;


public interface ComplianceDepOpService {

    /**
     * 插入数据到sys_inspect_archives
     * @param complianceDepOpVO 需要添加的用户信息 集合
     */
    void add(ComplianceDepOpVO complianceDepOpVO) throws ComplianceDepOpException;

    /**
     * 提交
     * @param complianceDepOpVO
     * @throws ComplianceDepOpException
     */
    void submit(ComplianceDepOpVO complianceDepOpVO) throws ComplianceDepOpException;

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysComplianceDepOp queryById(Long id) throws ComplianceDepOpException;



    void updateSysFlowByUserID(List<ComplianceDepOpVO> ComplianceDepOpList)throws ComplianceDepOpException;



}
