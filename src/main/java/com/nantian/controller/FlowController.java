package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.Application;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysFlow;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.FlowException;
import com.nantian.service.FlowService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.FlowVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 流程管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author 唐剑波
 * @version 1.0
 */
@Trade(channel = "api", transCode = "flow")
public class FlowController {
    private static Logger log= LoggerFactory.getLogger(FlowController.class);

    @Autowired
    FlowService flowService;

    /**
     * 查询用户
     * 只能查询当前用户机构及下属机构的用户信息
     * @param context 应用上下文
     * @param flowStatus 机流程状态 org 机构 adjustType 调整状态 positionLevel 职等 startDate 开始时间 endDate 结束时间
     * @param page 当前页数
     * @param limit 每页数量
     */
    @Push
    public void query(ApplicationContext context, String flowStatus, String org, String adjustType, String positionLevel, String startDate,
                      String endDate, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg(ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode(), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg());
            return;
        }
        Page<SysFlow> flow = flowService.query(flowStatus,org,adjustType,positionLevel,startDate,endDate, page, limit);

        ResponeResult responeResult = ResponeResult.responeBuilder(flow.getTotal(), flow.getResult());
        System.out.println("返回数据"+responeResult);
        context.setRstObject("data", responeResult);
    }

    /**
     * 新增竞聘流程
     * @param context 应用上下文
     * @param flowVO 新增的用户信息
     */
    @Push
    public void add(ApplicationContext context, @ParameterObject FlowVO flowVO) throws FlowException {
        if (StringUtils.isBlank(flowVO.getUsername())) {
            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "竞聘者不能为空");
            return;
        }
//        if (StringUtils.isBlank(candidateInfoVo.getUnit())) {
//            context.setErrorMsg(ErrorCodeEnum.PARAMETER_ERROR.getErrcode(), "竞聘者单位不能为空");
//            return;
//        }
        try {
            flowService.addFlow(flowVO);
        }  catch (FlowException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }
    }
}
