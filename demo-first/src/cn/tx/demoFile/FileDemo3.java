package cn.tx.demoFile;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("C:\\Windows\\System32\\cmd.exe");
        //判断文件是否存在
        boolean exists = file.exists();
        System.out.println(exists);


        //判断这个文件对象是否是文件
        boolean isFile = file.isFile();
        System.out.println("判断一个文件对象是否是文件"+isFile);

        //判断这个文件对象是否是文件
        boolean isDir = file.isDirectory();
        System.out.println("判断一个文件对象是否是文件"+isDir);


        boolean absolute = file.isAbsolute();
        System.out.println("判断一个文件对象是否是绝对路径"+absolute);

        boolean b = file.canRead();
        System.out.println("判断文件是否刻读"+b);

        boolean b1 = file.canWrite();
        System.out.println("判断文科是否可写"+b1);

        boolean hidden = file.isHidden();
        System.out.println("判断文件是否隐藏的"+hidden);


    }
}
