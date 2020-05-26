package com.nantian.base;

import com.nantian.easytrade.annotation.AbstractTrade;
import com.nantian.easytrade.annotation.InterceptorStack;

/**
 * <p>ClassName: TradeBase</p>
 * <p>Description: 基础交易配置 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-23</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@InterceptorStack({"auth", "operat"})
@AbstractTrade
public class TradeBase {
}
