package cn.tx.iobtye;

import java.io.*;

public class IOByteDemo {
    public static void main(String[] args) {
        //创建一个字节输入流
        OutputStream out=null;

        try {
            //创建一个字节的数组
            byte[] bs={32,52,26,4,34,3,63};
            out=new FileOutputStream(new File("a.txt"));
            //字节流不需要flush
            out.write(bs);



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (out!=null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
