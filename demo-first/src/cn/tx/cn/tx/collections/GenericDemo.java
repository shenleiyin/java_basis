package cn.tx.cn.tx.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        /**
         * 泛型
         */
        //定义一个集合里面指定只能存储一种数据类型
        List<String> list = new ArrayList<String>();
        list.add("小舞");
        list.add("武魂");
        list.add("武魂");
        list.add("武魂");
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        System.out.println(list1);

        //创建一个迭代器对象
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            //获得到String类型
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
