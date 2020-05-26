package com.nantian.service;



import com.nantian.entity.sys.SysAppBankingSupervision;
import com.nantian.entity.sys.SysConHonest;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.exception.ConHonestException;
import com.nantian.vo.AppBankingSupervisionVO;
import com.nantian.vo.ConHonestVO;

import java.util.List;


public interface AppBankingSupervisionService {

    /**
     * 插入数据到
     * @param appBankingSupervisionVO 需要添加的用户信息 集合
     */
    void add(AppBankingSupervisionVO appBankingSupervisionVO) throws AppBankingSupervisionException;



    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysAppBankingSupervision queryById(Long id) throws AppBankingSupervisionException;



    void updateSysFlowByUserID(List<AppBankingSupervisionVO> appBankingSupervisionVOList)throws AppBankingSupervisionException;



}
