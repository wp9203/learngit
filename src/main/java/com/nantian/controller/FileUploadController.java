package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.annotation.Upload;
import com.nantian.easytrade.core.file.FileUpload;
import com.nantian.easytrade.core.file.FileUploadConfiguration;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.easytrade.http.domain.MultipartFile;
import com.nantian.entity.sys.SysUnitRecommended;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.UnitRecommendedException;
import com.nantian.service.FlowService;
import com.nantian.service.UnitRecommendedService;
import com.nantian.util.RandomUtils;
import com.nantian.vo.UnitRecommendedVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 单位推荐管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author wp
 * @version 1.0
 */

@Trade(channel = "api", transCode = "fileUpload")
public class FileUploadController implements FileUpload {
    private static Logger log= LoggerFactory.getLogger(FileUploadController.class);

    @Upload
    @Push
    public void upload(ApplicationContext context, MultipartFile file,@ParameterObject UnitRecommendedVO unitRecommendedVO) {
        System.out.println(file.getDiskFilePath());//获取文件的保存地址
        System.out.println(file.getFileName());//获取文件的原始名称
        //获取文件的保存地址返回给前端页面
        context.setRstObject("diskFilePath",file.getDiskFilePath());
    }


    @Override
    public FileUploadConfiguration getFileConfiguration(ApplicationContext applicationContext) {
        FileUploadConfiguration configuration = new FileUploadConfiguration();
        // 文件上传的父目录
        String parentPath = "D:\\upload";
        // 得到当前日期作为文件夹名称
        String dirName = RandomUtils.getCurrentDateForString();
        // 构造文件夹对象
        File dirFile = new File(parentPath, dirName);
        if (!dirFile.exists()) {
            dirFile.mkdirs();// 创建文件夹
        }
        configuration.setSavePath(dirFile.getPath());
        return configuration;
    }
}
