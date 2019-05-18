package cn.tx.demo1;

import java.io.File;

public class FileTest4 {
    //定义一文件目录
    static int level;

    public static void main(String[] args) {

        //创建一个目录
        File file = new File("D:\\");
        System.out.println(file);
        System.out.println("--------------");
        parseFile(file);
    }

    private static void parseFile(File file) {
        if(file == null || !file.exists()){
            return;
        }
        //给层级来加
        level++;
        //获得文件对象的子文件的对象列表
        File[] files = file.listFiles();
        //遍历这些文件
        for (File f : files) {
            //打印层级的缩进
            for (int i = 0; i < level; i++) {
                System.out.println("\t");

                //打印文件
                System.out.println(f.getName());
                //判断这些文件是否是目录
                if (f.isDirectory()){
                    //递归的方式来遍历
                    parseFile(f);
                }
            }
            //本层次遍历完，把层级减回来
            level--;
        }
    }
}
