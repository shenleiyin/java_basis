package cn.tx.iotest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoTest {
    public static void main(String[] args) {
        //创建一个文件对象
        File file = new File("test.txt");
        Writer writer=null;
        try {
            //io流是需要关闭资源的 如果不这样设计，就会不能关闭资源
          writer =  new FileWriter(file);
          writer.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //判断writer 不是空指针异常
            if (writer!=null){
                try {
                    //在关闭前会做flush 的事情
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
