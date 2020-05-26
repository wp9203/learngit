package com.nantian.exception;

/**
 * <p>ClassName: RedisException</p>
 * <p>Description: redis缓存异常</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class RedisException extends RuntimeException {
    public RedisException() {

    }

    public RedisException(String message) {
        super(message);
    }

}
