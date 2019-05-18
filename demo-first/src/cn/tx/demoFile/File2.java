package cn.tx.demoFile;

import java.io.File;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\aaa\\aa.txt");
        //创建一个文件
        boolean newFile = file.createNewFile();
        System.out.println(newFile);



    }
}
