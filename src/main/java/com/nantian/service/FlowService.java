package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.entity.sys.SysFlow;
import com.nantian.exception.FlowException;
import com.nantian.vo.FlowVO;

public interface FlowService {

    /**
     * 分页查询
     * @param flowStatus 机流程状态 org 机构 adjustType 调整状态 positionLevel 职等 startDate 开始时间 endDate 结束时间
     * @param page 当前第几页
     * @param limit 每页数量
     * @return 带分页的数据
     */
    Page<SysFlow> query(String flowStatus, String org,String adjustType,String positionLevel,String startDate,
                        String endDate,int page, int limit);
    

    /**
     * 添加一个竞聘者
     * @param flowVO 需要添加的用户信息
     */
    void addFlow(FlowVO flowVO) throws FlowException;


}
