package com.nantian.constant;

import com.nantian.common.util.properties.PropertiesEntity;
import com.nantian.common.util.properties.PropertiesFactory;

/**
 * <p>ClassName: CacheConsts</p>
 * <p>Description: 缓存的key配置类</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-01</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class CacheConsts {
    /**
     * 存放session的用户key
     */
    public static String USER_NAME = "username";

    /**
     * 机构信息
     */
    public static String ORG_INFO = "org_info";

    /**
     * 获取缓存权限信息的key
     * @return 缓存权限的key
     */
    public static String getAuthCacheName (){
        PropertiesEntity entity = PropertiesFactory.buildFactory().getPropertiesEntry("application");
        return entity.getStringValue("project.name") + "_auth";
    }

}
