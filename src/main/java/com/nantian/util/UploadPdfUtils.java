package com.nantian.util;





import com.nantian.easytrade.annotation.Upload;
import com.nantian.easytrade.http.domain.MultipartFile;

import java.io.File;
import java.io.IOException;


public class UploadPdfUtils {
    @Upload
    public static  String uploadPdf(MultipartFile file, String path)throws IllegalStateException, IOException {
        // 得到当前日期作为文件夹名称
        String dirName = RandomUtils.getCurrentDateForString();
        // 构造文件夹对象
        File dirFile = new File(path, dirName);
        if (!dirFile.exists()) {
            dirFile.mkdirs();// 创建文件夹
        }
        // 得到文件原名
        String oldName = file.getFileName();
        File dest = new File(dirFile, oldName);

        //file.transferTo(dest);
        return path+dirName+oldName;

    }
}
