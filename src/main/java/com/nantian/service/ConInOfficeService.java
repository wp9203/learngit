package com.nantian.service;



import com.nantian.entity.sys.SysConInOffice;
import com.nantian.exception.ConInOfficeException;
import com.nantian.vo.ConInOfficeVO;

import java.util.List;


public interface ConInOfficeService {

    /**
     * 插入数据到
     * @param conInOfficeVO 需要添加的用户信息 集合
     */
    void add(ConInOfficeVO conInOfficeVO) throws ConInOfficeException;



    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysConInOffice queryById(Long id) throws ConInOfficeException;



    void updateSysFlowByUserID(List<ConInOfficeVO> conInOfficeVOList)throws ConInOfficeException;



}
