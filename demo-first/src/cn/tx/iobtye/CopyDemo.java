package cn.tx.iobtye;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            //创建字节输入流
            in = new FileInputStream("C:\\Users\\shen\\Pictures\\Saved Pictures\\69fba220a6c30c2258019e02 (2).jpg");
            //创建字节输出流
            out = new FileOutputStream("69fba220a6c30c2258019e02 (2).jpg");
//定义一个字节数组，输入流读取写入数组输出流读取数组中的内容昔日字节输出流对象
            byte[] bs = new byte[1024];

            int len = -1;
            while ((len = in.read(bs)) != -1) {
                //把读取的数据写入字节输出流
                out.write(bs, 0, len);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
