package cn.tx.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    /**
     * set 元素不可重复  元素无序的
     * HaashSet 元素唯一 无序行  允许nul 存在一个  不是线程安全 (效率高)
     *
     */

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //给set添加元素
        set.add("张三");
        set.add("张三");
        set.add("张1");
        set.add("张2");
        set.add("张3");
        System.out.println(set);
    }


}
