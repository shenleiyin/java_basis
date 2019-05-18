package cn.tx.for1;

import java.util.ArrayList;
import java.util.List;

public class ForDemo1 {
    public static void main(String[] args) {

        /**
         * 定义一个数组
         *
         */
       String [] strs = {"张三", "张三", "张三"};

       //增强for循环
        for ( String str:strs){
            System.out.println(str);
        }

        List<Integer> list =new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
//        for (Integer li:list){
//            System.out.println(li);
//        }
        System.out.println("----------");
        /**
         * 这个增强的for 不能支持变发
         */
        for (Integer i : list){
//            if (i.equals(2)){
//                list.add(10);
//            }
            System.out.println(i);
        }
        System.out.println("----------");

        for (int i = 0; i < list.size(); i++) {
            //根据索引获得集合的元素
            Integer var = list.get(i);
            //如果某个元素是2就在这个集合里加入一个10
            if(var.equals(2)){
                list.add(10);
            }
            System.out.println(var);
        }

        System.out.println(list);

    }
}
