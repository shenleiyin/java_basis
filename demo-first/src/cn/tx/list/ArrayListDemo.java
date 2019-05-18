package cn.tx.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * ArrayList 的底层是数组原里
         * 不是线程的安全集合
         */
        ArrayList list = new ArrayList();
        list.add(null);
        list.add("小明");
        list.add("小明");
        list.add("小明");
        list.add("小明");
        list.add("小明");
        list.add("小明");
        System.out.println(list);





    }
}
