package cn.tx.practice;

import java.io.File;

public class FileDemo {
    //定义文件目录的层级
    static int level;

    public static void main(String[] args) {

        //创建一个目录
        File file = new File("C:\\Users\\shen\\Desktop\\field");
        parseFile(file);
    }

    public static void parseFile(File file) {

        // file.exists  文件是否存在
        if (file == null || !file.exists()) {
            return;
        }

        //给层级加一
        level++;

        //获得文件对象的子文件对象
        File[] files = file.listFiles();
        //遍历这些子文件
        for (File f : files) {
            //打印层级的缩进
            for (int i = 0; i < level; i++)
                System.out.println("\t");

            //打印文件
            System.out.println(f.getName());
            //判断这些文件是否是目录
            if (f.isDirectory()) {
                //递归方式类遍历
                parseFile(f);
            }
        }
        //本层次遍历完毕
        level--;
    }

}
