package com.nantian.service;



import com.nantian.entity.sys.SysConHonest;
import com.nantian.entity.sys.SysConInOffice;
import com.nantian.exception.ConHonestException;
import com.nantian.exception.ConInOfficeException;
import com.nantian.vo.ConHonestVO;
import com.nantian.vo.ConInOfficeVO;

import java.util.List;


public interface ConHonestService {

    /**
     * 插入数据到
     * @param conHonestVO 需要添加的用户信息 集合
     */
    void add(ConHonestVO conHonestVO) throws ConHonestException;



    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysConHonest queryById(Long id) throws ConHonestException;



    void updateSysFlowByUserID(List<ConHonestVO> conHonestVOList)throws ConHonestException;



}
