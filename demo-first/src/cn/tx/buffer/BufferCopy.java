package cn.tx.buffer;

import java.io.*;

public class BufferCopy {
    public static void main(String[] args) {
        //定义一个高效缓冲字节流
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            //创建一个高效缓存字节流对象
            in = new BufferedInputStream(new FileInputStream("C:\\Users\\shen\\Pictures\\Saved Pictures\\69fba220a6c30c2258019e02 (2).jpg"));
            out = new BufferedOutputStream(new FileOutputStream("pp.jpg"));
            //定义一个字节数组
            byte[] bs = new byte[1024];
            //定义一个标志
            int len=-1;
            while ((len=in.read(bs)) !=-1){
                out.write(bs,0,len);
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
