package cn.tx.conver;

import java.io.*;

public class ConverterDemo1 {
    private InputStreamReader ow;

    public static void main(String[] args) {

        //创建字符流转换字节流的桥梁的对象
        InputStreamReader render = null;

        try {
            //字符流通向字节流的桥梁可以指定存储的编码
            render = new InputStreamReader(new FileInputStream("b.txt"),"GBK");
            char[] cs=new char[1024];
            int len = render.read(cs);
            System.out.println(new String(cs,0,len) );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (render != null) {
                    render.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
