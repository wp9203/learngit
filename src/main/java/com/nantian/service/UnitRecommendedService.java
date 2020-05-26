package com.nantian.service;


import com.nantian.entity.sys.SysUnitRecommended;
import com.nantian.exception.UnitRecommendedException;
import com.nantian.vo.UnitRecommendedVO;
import java.util.List;


public interface UnitRecommendedService {

    /**
     * 添加一个竞聘者
     * @param unitRecommendedVos 需要添加的用户信息
     */
    void addUnitRecommendedInfos(UnitRecommendedVO unitRecommendedVos) throws UnitRecommendedException;

    /**
     * 根据id 查询
     */
    SysUnitRecommended querySysUnitRecommended(Long id) throws UnitRecommendedException;

    /**
     * 更新流程表 sys_flow
     * @param unitRecommendedVOList
     * @throws UnitRecommendedException
     */
    void updateSysFlowByUserID(List<UnitRecommendedVO> unitRecommendedVOList)throws UnitRecommendedException;
    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysUnitRecommended queryById(Long id) throws UnitRecommendedException;
    /**
     * 提交 ---更新sys_unit_recommended 字段isfinish = 1
     * @param sysUnitRecommendedList
     * @throws UnitRecommendedException
     */
    void updateSysUnitRecommendedIsfinish(List<SysUnitRecommended> sysUnitRecommendedList)throws UnitRecommendedException;


}
