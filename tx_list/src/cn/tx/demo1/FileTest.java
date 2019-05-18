package cn.tx.demo1;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:\\file.txt");
//        //或取文件
//        String name = file.getName();
//        System.out.println(name);
//
//        //或取文件夹
//        boolean directory = file.isDirectory();
//        System.out.println(directory);
//



       //创建文件夹
        File file = new File("D:\\files");
        file.createNewFile();

        //创建目录
//        boolean mkdir = file.mkdir();

        /**
         * isFile 判断是不是文件
         *
         */

        /**
         * 文件的大小
         */
        long length = file.length();
        System.out.println(length);

        /**
         * 获得文件最后修改时间
         */
        long l = file.lastModified();
        System.out.println(l);
        Date d = new Date(l);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d));

    }
}
