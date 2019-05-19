package cn.tx.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo2 {
    public static void main(String[] args) {
        //创建一个对象
        File file = new File("test.txt");
        Reader reader = null;
        try {
            //创建出入流对象FileReader
            reader = new FileReader(file);
            //定义一个数组
            char[] cs = new char[5];
            int len = -1;
            while ((len = reader.read(cs)) !=-1){
                //把字符数组变成字符串
                String str = new String(cs, 0, len);
                System.out.print(str);
            }

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
