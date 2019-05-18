package cn.tx.stringbuffer;

public class SystemDemo {
    public static void main(String[] args) {
        //或取毫秒数
        long l = System.currentTimeMillis();
        System.out.println(l);

        //退出
        System.exit(-1);

        long start = System.currentTimeMillis();
        method();
        long end = System.currentTimeMillis();
        System.out.println("方法调用话费多少毫秒：" + (end - start));

    }

    public static void method() {
        for (int i = 0; i < 10; i++) {
            System.out.println("程序在运行中");

        }
    }
}
