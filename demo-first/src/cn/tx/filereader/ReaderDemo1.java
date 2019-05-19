package cn.tx.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReaderDemo1 {
    public static void main(String[] args) {
        //创建一个对象
        File file = new File("test.txt");
        Reader reader = null;
        try {
            //创建出入流对象FileReader
            reader = new FileReader(file);
           //定义一个数组
            char[] chars = new char[5];
            //向字符数组中添加数据
            int len=reader.read(chars);
            System.out.println("读取的长度"+len+"   读取的内容"+Arrays.toString(chars));


            //如果读取到的是负一  后面就没有字符

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
