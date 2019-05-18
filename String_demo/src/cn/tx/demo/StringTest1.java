package cn.tx.demo;

import java.util.Arrays;

public class StringTest1 {
    public static void main(String[] args) {
        String s = "hesdflfs";
        //从某一个索引开向后出名的字符串索引的位置
        int ls = s.indexOf("ls", 1);
        System.out.println(ls);

        //获得这个字符串对应的字符的数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        //把字符串转换层字符的数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));


    }
}
