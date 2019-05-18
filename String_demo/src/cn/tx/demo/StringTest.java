package cn.tx.demo;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello world";

        //判断一个字符串是否以某个字符结尾
        boolean world = s.endsWith("world");
        System.out.println(world);

        String s2 = new String("hello world");

        //判断两个字符串的值是否相等
        boolean equals = s.equals(s2);
        System.out.println(equals);

        //判断两个字符串忽悠大小写
        boolean b = s.equalsIgnoreCase(s2);
        System.out.println(b);

        //判断字符串是否包含
        boolean hello = s.contains("hello");
        System.out.println(hello);

        //判断 一个字符串是否以什么开始
        boolean hell = s.startsWith("hell");
        System.out.println(hell);

        //判断是不是空字符串
        boolean empty = s.isEmpty();
        System.out.println(empty);
        boolean empty1 = "".isEmpty();
        System.out.println(empty1);

    }

}
