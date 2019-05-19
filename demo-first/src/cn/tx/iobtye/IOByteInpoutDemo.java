package cn.tx.iobtye;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOByteInpoutDemo {
    public static void main(String[] args) {

        //创建字符流输入对象
        InputStream in = null;

        try {
            //创建一个字节的数组
            byte[] bs = new byte[1024];
            //创建字符输入流的对象  如果有中文会出现乱码
            in = new FileInputStream("a.txt");
//            int r = in.read();
//            System.out.println((char) r);
//            int len = in.read(bs);
//            System.out.println("读取的字节数" + len + "   读取的内容" + new String(bs,0,len));

            //定义读取的长度的标尺
            int len = -1;
            while ((len = in.read(bs)) != -1) {
                String s = new String(bs, 0, len);
                System.out.print(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
