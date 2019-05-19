package cn.tx.print;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintDemo {
    public static void main(String[] args) {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("c.txt");
            pw.print(1);
            pw.print("ad");
            pw.print("你好");
            pw.print("1.3");
            pw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (pw!=null){
                pw.close();
            }
        }
    }
}
