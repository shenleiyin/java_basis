package cn.tx.filereader;

import java.io.*;

public class ReaderDemo4 {
    public static void main(String[] args) {
        //创建一个对象
        File file = new File("src/cn/tx/filereader/ReaderDemo.java");
        //写入文件
        File fl = new File("ReaderDemo.java");
        Reader reader = null;
        Writer writer = null;


        try {
            reader = new FileReader(file);
            //创建字符输出流的对象
            writer = new FileWriter(fl);

            char[] cs = new char[1024];
            int len = -1;
            while ((len = reader.read(cs)) != -1) {
                //把输入流读到的数据写入字符输出流
                writer.write(cs, 0, len);
            }
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer!=null){
                    writer.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
