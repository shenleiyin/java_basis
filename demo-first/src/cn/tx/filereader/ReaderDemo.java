package cn.tx.filereader;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        //创建一个对象
        File file = new File("test.txt");
        Reader reader = null;
        try {
            //创建出入流对象FileReader
            reader = new FileReader(file);
            //读数据,读取的字符被转换成阿城市吗
            int read = -1;
            //单个字符的读取
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }

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
