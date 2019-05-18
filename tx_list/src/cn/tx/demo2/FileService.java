package cn.tx.demo2;

import javax.xml.crypto.Data;
import java.io.File;

public class FileService {

    public static void parseFile(File file){
        if(file == null || !file.exists()){
            return;
        }

//        //获得文件对象的子文件的对象列表
//        File[] files = file.listFiles();
        //遍历这些文件
        if (file.isDirectory()){
            File[] files =file.listFiles();
            if (files !=null){
                for (File file1 : files) {
                    if (file1.isDirectory()){
                        parseFile(file1);
                    }else {
                        MyFile myFile = createMyFile(file1);
                    }


                }
            }
        }
    }

    private static MyFile createMyFile(File file) {
        //获得文件名
        String name = file.getName();

        long l=file.lastModified();
        Data lastMod = new Data();
        int lastPointIndex = name.lastIndexOf(".");
        String extendsName = name.substring(lastPointIndex + 1);

        //获得文件的大小
        long length = file.length();

        //创建MyFile
//        MyFile mf = new MyFile(extend)
//        return mf;
    }


}
