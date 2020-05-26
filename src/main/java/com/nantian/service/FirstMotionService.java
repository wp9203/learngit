package com.nantian.service;

import com.nantian.entity.sys.SysFirstMotion;
import com.nantian.entity.sys.SysFlow;
import com.nantian.exception.FirstMotionException;
import com.nantian.vo.FirstMotionVO;

public interface FirstMotionService {

    void add(FirstMotionVO firstMotionVO) throws FirstMotionException;

    void update(FirstMotionVO firstMotionVO);

    SysFlow getFlowById(Long id);

    /**
     * 根据动议，获取动议信息
     * @param Id 动议id
     * @return 动议信息
     */
    SysFirstMotion getFirstMotion(Long Id);

    /**
     * 更新动议表（动议相关字段）
     * @param firstMotionVO 机构信息
     */
    void updateflow(FirstMotionVO firstMotionVO);

    /**
     * 根据主键查询 档案
     * @param id
     * @return
     */
    SysFirstMotion queryFirstMotion(Long id) throws FirstMotionException;
}
