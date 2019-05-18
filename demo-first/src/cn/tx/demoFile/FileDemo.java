package cn.tx.demoFile;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("E:\\test.txt");
        boolean delete = file.delete();
        //删除不走回收站
        System.out.println(delete);
        /**
         * 只有是空文件才被删除
         */


    }
}
