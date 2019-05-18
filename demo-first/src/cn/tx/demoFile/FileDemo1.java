package cn.tx.demoFile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("E:\\aaa\\aa.txt");
       //获得文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        //创建一个文件对象，用相对路径，相对路径就是当前项目的路径

        File file1 = new File("aa.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);

        /**
         * 获得的就是当前文件对象的路径
         */
        String path = file1.getPath();
        System.out.println("文件的路径"+path);
        System.out.println("------------------------");

        //获得文件名
        String name = file1.getName();
        System.out.println(name);

        //获得文件的大小
        long length = file1.length();
        System.out.println(length);

        //获得最后的修改时间
        long l = file1.lastModified();
        System.out.println(l);




    }
}
