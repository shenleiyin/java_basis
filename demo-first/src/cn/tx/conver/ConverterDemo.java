package cn.tx.conver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConverterDemo {
    public static void main(String[] args) {

        //创建字符流转换字节流的桥梁的对象
        OutputStreamWriter ow = null;

        try {
            //字符流通向字节流的桥梁可以指定存储的编码
            ow = new OutputStreamWriter(new FileOutputStream("b.txt"),"GBK");
//            ow = new OutputStreamWriter(new FileOutputStream("b.txt"));
            ow.write("你好");
            ow.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ow != null) {
                    ow.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
