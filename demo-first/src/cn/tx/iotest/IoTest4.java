package cn.tx.iotest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoTest4 {
    public static void main(String[] args) {
        //创建一个文件对象
//        File file = new File("test.txt");
        Writer writer = null;
        try {
            //io流是需要关闭资源的 如果不这样设计，就会不能关闭资源
            writer = new FileWriter(new File("test.txt"),true);
            writer.write("你好");
            for (int i = 0; i < 100; i++) {
                writer.write("Hello world");
                //每次写入10给  做一次flush
                if (i % 10 == 0) {
                    writer.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
