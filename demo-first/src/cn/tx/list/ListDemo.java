package cn.tx.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    /**
     * list 是一个有序的集合，就像我们的数组一样，有丰富的api
     */
    public static void main(String[] args) {
        //创建一个list 集合
        List list = new ArrayList();
        //项目未 添加元素
        list.add("小明");
        list.add("砂锅粥");
        System.out.println(list);

        //在指定的位置添加元素
        list.add(1, "李四");
        System.out.println(list);

        //根据索引号来或取这个索引对应的内容 记住不用预计
//        String o = (String)list.get(1);
//        System.out.println(o);

        //获得集合的长度
//        int size = list.size();


        //我们使用ListIterator 来迭代
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            //获得迭代的元素
            String next = (String) listIterator.next();
//            if ("李四".equals(next)){
//                list.add(next);
//            }// 不能再一遍遍历一遍操作

            //迭代器可以给我们提供一个add方法让我们避免变法操作
            //listIerator.add 能在遍历的时候添加 你添加的时候本次不生效
//            listIterator.add("wangwu");
            System.out.println(next);

        }

        System.out.println("----------------------");
        while (listIterator.hasPrevious()) {
            //获得迭代的元素
            String next = (String) listIterator.previous();

            System.out.println(next);

        }

        System.out.println("------------for----------");
        //for 循环对list 的变量 我们可以使用动态的方式获取
        for (int i = 0; i < list.size(); i++) {
            //根据索引获得对应的元素
            String str = (String) list.get(i);
            if ("砂锅粥".equals(str)) {
                list.add("小明");
            }
            System.out.println(str);
        }

    }
}
