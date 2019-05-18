package cn.tx.demo;

import java.util.Scanner;

public class Demo {
    /**
     * 从控制台输入一段字符串，首字母变成大写，其余小写
     */
    public static void main(String[] args) {

        while (true){
            //扫描器
            Scanner scanner = new Scanner(System.in);
            //获得一个输入的字符串
            String s = scanner.nextLine();
            if (s == null || s.isEmpty()) {
                System.out.println("输入的字符串不合法,请重新输入");
                continue;
            }
            if ("exit".equals(s)){
                break;
            }
            //获得首字母
            String substring = s.substring(0, 1);
            //获得第二后的
            String substring1 = s.substring(1);
            //把手首字母大写
            String s1 = substring.toUpperCase();
            //把剩余部分变小写
            String s2 = substring1.toLowerCase();
            System.out.println(s1+s2);
        }

        System.out.println("程序结束");

        //缺掉空格
        String s4 = "  dsafasg   ";
        String trim = s4.trim();
        System.out.println(trim);

    }
}
