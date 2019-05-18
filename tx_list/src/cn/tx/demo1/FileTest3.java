package cn.tx.demo1;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        //获得系统的跟
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }

        //获得文件夹下的所有的对象
        File file = new File("D:\\Program Files (x86)");
        /**
         * isDirectory 判断是不是文件
         */
        if (file.isDirectory()) {
            //获得文件下的字文件对象
            File[] files1 = file.listFiles();
            for (File file1 : files1) {
                System.out.println(file1);
            }
        }

    }
}
