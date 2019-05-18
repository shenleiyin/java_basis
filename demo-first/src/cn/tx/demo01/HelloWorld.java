package cn.tx.demo01;

public class HelloWorld {
    public static void main(String[] args) {
        /**
         * 主方法生成  psvm
         * 输出语句 sout
         * 使用fori 快捷键生成普通for 循环
         * 增强for 循环快捷键生成，使用 集合.for的快捷键生成；
         * 使用ctrl+alt+t 快捷键，可以生成流程控制语句
         * */
        System.out.println("Hello Worlld");
        for (int i = 0; i < 3; i++) {
            System.out.println("你好java");
        }
        //  定义数组
        String[] strs = {"a", "b", "c"};
        for (String str : strs) {
            System.out.println(str);
        }

    }
}
