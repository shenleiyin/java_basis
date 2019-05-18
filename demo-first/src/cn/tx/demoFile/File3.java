package cn.tx.demoFile;

import java.io.File;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\aaa\\bbb");
        //创建一个目录
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

    }
}
