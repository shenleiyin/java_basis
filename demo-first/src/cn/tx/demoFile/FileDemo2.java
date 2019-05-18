package cn.tx.demoFile;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
        //获得电脑磁盘的根目录
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));

        //获得一个目录的子文件对象
        File file1=new File("C:\\Users\\shen\\IdeaProjects");
        //获得 c:\\下的字文件对象
        File[] files1 = file1.listFiles();
        for (File file : files1) {
            System.out.println(file);
        }

        //获得子文件的名字
        String[] list = file1.list();
        System.out.println(Arrays.toString(list));


    }
}
