package com.nantian.util;

import com.nantian.vo.CandidateInfoVo;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * <p>ClassName: ResponeResult</p>
 * <p>Description: 根据页面数据生成word</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-4-26</p>
 */
public class SignToWordUtils {

    public static boolean writeWordFile(List<CandidateInfoVo> list ,String path){
        System.out.println("下载word");
        boolean result = false;
        try{
            if(!"".equals(path)){
                StringBuilder sb = new StringBuilder();
                sb = sb.append("<h1>签报内容:</h1>") ;
                File fileDir = new File(path);
                String[] nums =new String[]{"一","二","三","四","五","六","七","八","九","十"};
                if(fileDir.exists()){
                    String fileName = System.currentTimeMillis()+"签报.doc";
                    List<String> part1 = new ArrayList<>(); //副标题
                    for(int i=0;i<list.size();i++){ //先将所有的副标题放入一个集合中且不重复
                        String title = list.get(i).getAdjustType();
                        if(!part1.contains(title)){
                            part1.add(title);
                        }
                    }
                    System.out.println(part1);
                    Map<String,List<CandidateInfoVo>> map = new HashMap<>();
                    for(CandidateInfoVo info:list){
                        if(map.containsKey(info.getAdjustType())){
                            map.get(info.getAdjustType()).add(info);
                        }else{
                            List<CandidateInfoVo> newList = new ArrayList<>();
                            newList.add(info);
                            map.put(info.getAdjustType(),newList);
                        }
                    }
                    System.out.println("map:"+map);
                    int num = 1;
                    for(Map.Entry<String, List<CandidateInfoVo>> entry:map.entrySet()){
                        sb =sb.append("<p>"+nums[num-1]+"、" +entry.getKey()+"</p>") ;
                        int count=1;
                        for(CandidateInfoVo info :entry.getValue()){
                            sb.append("<div>"+ count +'.'+info.getUnit()+info.getPosition()+'('+ info.getPositionLevel() +')'+ info.getCandidateName()
                                    +info.getAdjustType()+info.getAspiringUnit()+info.getAspiringPosition()+'('+info.getAspiringPositionLevel()+')' +"</div>");
                            count++;
                        }
                        num++;
                    }
                    byte b[] = sb.toString().getBytes();
                    ByteArrayInputStream bais = new ByteArrayInputStream(b);
                    POIFSFileSystem poifs = new POIFSFileSystem();
                    DirectoryEntry directory = poifs.getRoot();
                    DocumentEntry documentEntry = directory.createDocument("WordDocument",bais);
                    FileOutputStream out = new FileOutputStream(path+fileName);
                    poifs.writeFilesystem(out);
                    bais.close();
                    out.close();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("下载word完成");
        return result;
    }
}
