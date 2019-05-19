package cn.tx.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        //创建高效缓冲字符输出流
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("IoTest.java"));
            //写一行数据
            writer.write("Hello");
            //换行
            writer.newLine();
            writer.write("Hello");
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
