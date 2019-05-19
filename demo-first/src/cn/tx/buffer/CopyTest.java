package cn.tx.buffer;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        //创建高效缓冲流
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            //创建高效缓冲输入流
            reader = new BufferedReader(new FileReader("src/cn/tx/buffer/BufferWriterDemo.java"));
            //创建高效输出流
            writer = new BufferedWriter(new FileWriter("IoTest1"));

            //创建一个读取一行的变量
            String line=null;
            while ((line=reader.readLine())!=null){
                //把读入的这行数据写入到高效缓冲流字符输出流里面
                writer.write(line);
                writer.newLine();
                writer.flush();
            }



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
