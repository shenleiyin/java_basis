package cn.tx.practice;

import java.io.File;

public class FilePractice1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\shen\\Desktop\\field");
        parseFile(file);
    }

    public static void parseFile(File file){
        if (file == null || !file.exists()){
            return;
        }
        //获得文件对的子文件对象
        File[] files = file.listFiles();
        for (File file1 : files) {
            //判断这些文件是否是目录
            if (file1.isDirectory()){
                //递归调用
                parseFile(file1);
            }else {
                file1.delete();
            }
        }
        //删除文件夹
        file.delete();

    }
}
