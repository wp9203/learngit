package com.nantian.util;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: ResponeResult</p>
 * <p>Description: 响应视图封装</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-02</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class ResponeResult {

    /**
     * 查询数据的总数量
     */
    private long count;

    /**
     * 表格数据
     */
    private List<?> rows;

    public static ResponeResult responeBuilder(long count, List<?> rows) {
        return new ResponeResult(count, rows);
    }

    public static ResponeResult responeEmpty () {
        return new ResponeResult(0, new ArrayList<>());
    }

    public ResponeResult(long count, List<?> rows) {
        this.count = count;
        this.rows = rows;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
