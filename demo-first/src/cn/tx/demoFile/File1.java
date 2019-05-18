package cn.tx.demoFile;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        //文件的构造器用来创建文件对象的
        File file = new File("E:\\test.txt");
        System.out.println(file);

        File file1 = new File("E:\\", "test.txt");
        System.out.println(file1.getName());


        //java中File类的对象可以代表目录，也可以代表文件
        File file2 = new File("E:\\aaa");
        System.out.println(file2);

        //根据目录的文件对象创建一个文件
//        File file3 = new File(file2, "test.txt");
//        System.out.println(file3);


    }
}
