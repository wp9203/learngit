package com.nantian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.nantian.constant.Application;
import com.nantian.entity.sys.SysRole;
import com.nantian.entity.sys.SysUser;
import com.nantian.generator.Generator;
import com.nantian.generator.GeneratorFactory;
import com.nantian.generator.JdbcConfig;
import com.nantian.generator.Table;
import com.nantian.generator.enumeration.GeneratorEnum;
import com.nantian.util.SnowflakeIdUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * <p>ClassName: Main</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
//        SysUser user = new SysUser();
//        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
//
//        user.setId(snowflakeIdUtils.nextId());
//        String name = JSON.toJSONString(user);
//        System.out.println(name);
//
//        SysRole role = new SysRole();
//        role.setId(snowflakeIdUtils.nextId());
//        System.out.println(JSON.toJSONString(role));
//        idCreate();
        createTable();
    }

    public static void idCreate() {
        //加盐
//        ByteSource source = ByteSource.Util.bytes("admin");
//        SimpleHash hash = new SimpleHash("MD5", "123456", source, 1024);
//
//        System.out.println(hash.toHex());

        SnowflakeIdUtils snowflakeIdUtils = new SnowflakeIdUtils(00001, 00002, 1565020800000L);
//        Long start = System.currentTimeMillis();
//        for (int i = 0; i < 2000000; i++) {
//            Long id = snowflakeIdUtils.nextId();
//        }
        for(int i = 0;i < 5; i ++) {
            Long id = snowflakeIdUtils.nextId();
//        Long end = System.currentTimeMillis();
//        System.out.println(2000000/(end - start));
            System.out.println(id);
        }

    }

    public static void createTable() {

        Generator generator = GeneratorFactory.buildFactory(GeneratorEnum.MYBATIS_GENERATOR);
        //设置jdbc连接
        JdbcConfig jdbcConfig = new JdbcConfig();
        jdbcConfig.setConnectionURL("jdbc:oracle:thin:@127.0.0.1:1521:ORCL");
        jdbcConfig.setDriverClass("oracle.jdbc.driver.OracleDriver");
        jdbcConfig.setUserId("admin");
        jdbcConfig.setPassword("123456");
        generator.setJdbcConfig(jdbcConfig);

        //设置实体类生成的路径
        generator.setModelTargetPackage("com.nantian.entity.sys");
        generator.setModelTargetProject("./src/main/java");

        //设置mapp接口生成的路径
        generator.setClientTargetPackage("com.nantian.mapper.sys");
        generator.setClientTargetProject("./src/main/java");

        //设置生成xml文件的路径
        generator.setSqlMapTargetPackage("com.nantian.mapper.sys");
        generator.setSqlMapTargetProject("./src/main/java");

        //添加需要生成表名
//        Table table = new Table();
//        table.setSchema("easytrade");
//        table.setTableName("user");
//        table.setEnableCountByExample(false);
        //设置表主键字段，为空时，默认不生成主键策略
//        table.setPrimaryKey("id");
        //设置数据库方言
//        table.setSqlStatment("oracle");
        //设置ID是事自增，默认为false
//        table.setIdentity(true);
        //手动添加每张表的配置
        //generator.addTable(table);
        //直接添加表名，其它配置按默认配置
        //注意，在这里添加了指定用户名后，要在mapper.xml中，删除对应的用户名。否则查询时会带上用户名
//        generator.setDefaultSchema("USER");

//        generator.addTable(new Table("SYS_ORG").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP"));
//        generator.addTable(new Table("SYS_USER").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP").setColumnOverride("LAST_LOGIN_TIME", "TIMESTAMP"));
//        generator.addTable(new Table("SYS_ROLE").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP"));
//        generator.addTable(new Table("SYS_PERMISSION").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP"));
//        generator.addTable(new Table("SYS_OPERAT_LOG").setColumnOverride("CREATION_TIME", "TIMESTAMP"));
        generator.addTable(new Table("SYS_FIRST_MOTION").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP")
                .setColumnOverride("MEETING_DATE", "TIMESTAMP")
                //.setColumnOverride("REPLY_DATE","TIMESTAMP")
        );
//                .setColumnOverride("WRITTEN_DATE", "TIMESTAMP")
//                .setColumnOverride("INTERVIEW_DATE", "TIMESTAMP").setColumnOverride("THESIS_DATE", "TIMESTAMP"));
//        generator.addTable(new Table("SYS_DICTIONARY").setColumnOverride("CREATION_TIME", "TIMESTAMP").setColumnOverride("UPDATE_TIME", "TIMESTAMP"));
//        generator.addTableName("SYS_USER_ROLE");
//        generator.addTableName("SYS_ROLE_PERMISSION");BIRTHDAY MEETING_DATE REPLY_DATE WRITTEN_DATE INTERVIEW_DATE THESIS_DATE

//        generator.addTableName("SYS_DICTIONARY");
        //设置全局是否生成带example类型
        //generator.setEnableExample(false);
        //生成代码
        generator.create();
    }

}
