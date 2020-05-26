package com.nantian.service;



import com.nantian.entity.sys.SysInspectArchives;
import com.nantian.exception.InspectArchivesException;
import com.nantian.vo.InspectArchivesVO;

import java.util.List;


public interface InspectArchivesService {

    /**
     * 插入数据到sys_inspect_archives
     * @param inspectArchivesVO 需要添加的用户信息 集合
     */
    void addInspectArchivesInfos(InspectArchivesVO inspectArchivesVO) throws InspectArchivesException;

    /**
     * 提交
     * @param inspectArchivesVO
     * @throws InspectArchivesException
     */
    void SubmitInspectArchives(InspectArchivesVO inspectArchivesVO) throws InspectArchivesException;

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysInspectArchives queryById(Long id) throws InspectArchivesException;

    /**
     * 根据id获取表中存在的所有字段
     * @param id
     * @return
     */
    SysInspectArchives querySysInspectArchives(Long id) throws InspectArchivesException;

    void updateSysFlowByUserID(List<InspectArchivesVO> inspectArchivesVOList)throws InspectArchivesException;



}
