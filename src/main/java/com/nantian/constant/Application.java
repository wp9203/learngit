package com.nantian.constant;

import com.nantian.easytrade.annotation.PropertiesConfiguration;
import com.nantian.easytrade.annotation.Value;

/**
 * <p>ClassName: Application</p>
 * <p>Description: 系统配置类 </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@PropertiesConfiguration("application")
public class Application {
    /**
     * 用户密码加密算法
     */
    @Value("hash.algorithm.name")
    public static String HASH_ALGORITHM_NAME;

    /**
     * 加密算法加盐次数
     */
    @Value("hash.iterations")
    public static int HASH_ITERATIONS;

    /**
     * 项目名称
     */
    @Value("project.name")
    public static String PROJECT_NAME;

    /**
     * 雪花算法对应的机器id
     */
    @Value("worker")
    public static long WORKER;

    /**
     * 雪花算法对应的数据中心id
     */
    @Value("datacenter")
    public static long DATACENTER;

    /**
     * 雪花算法开始时间
     */
    @Value("snow.time")
    public static long SNOW_TIME;

    /**
     * 分页查询单页最大值
     */
    @Value("page.count")
    public static int PAGE_COUNT;

    /**
     * 新增用户时，默认密码
     */
    @Value("default.password")
    public static String DEFAULT_PASSWORD = "";

    /**
     * 字典数据缓存redis时间
     */
    @Value("dictionary.cache.time")
    public static Long DICTIONARY_CACHE_TIME;
}
