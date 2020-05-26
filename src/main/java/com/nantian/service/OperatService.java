package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysOperatLog;
import com.nantian.exception.SysOperatLogException;
import com.nantian.vo.OperatLogVO;

import javax.management.OperationsException;
import java.util.List;

/**
 * <p>ClassName: OperatService</p>
 * <p>Description: 用户操作service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface OperatService {
    /**
     * 添加一条操作日志
     */
    void addOperatRecord();

    /**
     * 查询操作记录
     *
     * @param operatLogVO 条件
     * @param page 页码
     * @param limit 每页条数
     * @return 查询操作记录
     */
    Page<SysOperatLog> query(OperatLogVO operatLogVO, int page, int limit);

}
