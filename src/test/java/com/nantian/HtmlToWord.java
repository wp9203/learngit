package com.nantian;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtmlToWord {
    public static void main(String[] args){
          List<User> list = new ArrayList<>();
          User user1 = new User();
          user1.setName("张三");
          user1.setAge(12);

        User user2 = new User();
        user2.setName("张三");
        user2.setAge(12);

        User user3 = new User();
        user3.setName("张飞");
        user3.setAge(12);
          list.add(user1);
        list.add(user2);
        list.add(user3);
        List<String> newList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String name = list.get(i).getName();
            if(!newList.contains(name)){
                newList.add(name);
            }
        }
        for(int i = 0;i<newList.size();i++){
            String flag = newList.get(i) ;
            System.out.println("flag="+flag);
            for(int k =0 ;k<list.size();k++){
                System.out.println("K"+k);
                if(list.get(k).getName()==flag){
                    System.out.println(list.get(k));
                }
            }
        }

        //writeWordFile();
    }
    public static boolean writeWordFile(){
        boolean result = false;
        String path = "D:/";
        try{
            if(!"".equals(path)){

                File fileDir = new File(path);
                if(fileDir.exists()){
                    String fileName = "20200425.doc";
                    String content = "<html>" +
                            "<head>签报内容</head>" +
                            "<body>" +
                            "<h2>签报内容:</h2>" +
                            "<div id='part1'>" +
                            "<h1>一.提拔:</h 1>" +
                            "</div>" +
                            "" +
                            "</body>" +
                            "</html>";
                    byte b[] =content.getBytes();
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
