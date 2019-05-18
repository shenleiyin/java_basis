package cn.tx.demoFile;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        //创建一个对象
        File file = new File("E:\\aaa\\ccc\\ddd\\fff");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);



    }
}
