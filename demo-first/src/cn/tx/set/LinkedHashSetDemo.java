package cn.tx.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        /**
         * LinkedHashSet  是有序的
         */
        Set<String> set = new LinkedHashSet<>();
        set.add("张11");
        set.add("张三");
        set.add("张1");
        set.add("张2");
        set.add("张3");
        System.out.println(set);

    }
}
