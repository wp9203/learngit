package com.nantian.service;



import com.nantian.entity.sys.SysAnnouncedInOffice;
import com.nantian.entity.sys.SysAppBankingSupervision;
import com.nantian.exception.AnnouncedInOfficeException;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.vo.AnnouncedInOfficeVO;
import com.nantian.vo.AppBankingSupervisionVO;

import java.util.List;


public interface AnnouncedInOfficeService {

    /**
     * 插入数据到
     * @param announcedInOfficeVO 需要添加的用户信息 集合
     */
    void add(AnnouncedInOfficeVO announcedInOfficeVO) throws AnnouncedInOfficeException;



    /**
     * 根据主键查询
     * @param id
     * @return
     */
    SysAnnouncedInOffice queryById(Long id) throws AnnouncedInOfficeException;



    void updateSysFlowByUserID(List<AnnouncedInOfficeVO> announcedInOfficeVOList)throws AnnouncedInOfficeException;



}
