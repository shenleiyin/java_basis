package cn.tx.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    /**
     * set 元素不可重复  元素无序的
     * HaashSet 元素唯一 无序行  允许nul 存在一个  不是线程安全 (效率高)
     *
     * 如果对象的hash值和equals都相等那么就是重复的对象
     */

    /**
     * 集合的排重
     * @param args
     */
    public static void main(String[] args) {
       //创建一个集合
        Set<Person> set = new HashSet<>();
        set.add(new Person("小明",12));
        set.add(new Person("小",12));
        set.add(new Person("小明",12));

        System.out.println(set);


    }


}
