package com.nantian.controller;

import com.github.pagehelper.Page;
import com.nantian.constant.Application;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.annotation.Extend;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysOperatLog;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.service.OperatService;
import com.nantian.util.ResponeResult;
import com.nantian.vo.OperatLogVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *
 */
@Extend
@Trade(channel = "api", transCode = "operat")
public class OperatController {

    @Autowired
    private OperatService operatService;

    @Push
    public void query(ApplicationContext context, String username, String ipAddress, int page, int limit) {
        if (limit > Application.PAGE_COUNT) {
            context.setRstObject ("data", ResponeResult.responeEmpty());
            context.setErrorMsg (ErrorCodeEnum.QUERY_OVER_ERROR.getErrcode (), ErrorCodeEnum.QUERY_OVER_ERROR.getErrmsg ());
            return;
        }
        OperatLogVO operatLogVO = new OperatLogVO ();
        if (username != null) {
            operatLogVO.setAccount (username);
        }
        if (ipAddress != null) {
            operatLogVO.setIpAddress (ipAddress);
        }
        Page<SysOperatLog> sysOperatLogs = operatService.query(operatLogVO, page, limit);
        ResponeResult responeResult = ResponeResult.responeBuilder (sysOperatLogs.getTotal (), sysOperatLogs.getResult ());

        context.setRstObject ("data", responeResult);
    }
}
