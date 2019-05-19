package cn.tx.conver;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //
        String s = new String("你好");
        byte[] gbks = s.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
    }
}
