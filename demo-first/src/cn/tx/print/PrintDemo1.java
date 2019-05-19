package cn.tx.print;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintDemo1 {
    public static void main(String[] args) {

        PrintWriter pw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("c.txt"));
            //System.out  指定是打印到控制台
            pw = new PrintWriter(System.out);

            String line = null;
            while ((line = br.readLine()) != null) {
                pw.print(line);
                pw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
