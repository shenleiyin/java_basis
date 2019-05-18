package cn.tx.util;

import cn.tx.set.Person;
import cn.tx.treeset.Student;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 6};
        String s = Arrays.toString(arr);
        System.out.println(s);

        float[] arrf = {2.4f, 3.5f};
        System.out.println(Arrays.toString(arrf));

        Person [] ps=new Person[2];
        ps[0] = new Person("小明",24);
        ps[1] = new Person("小亮",20);
        System.out.println(Arrays.toString(ps));

        System.out.println("----------------");
        Student[] pss1 = new Student[3];
        pss1[0]=new Student("协整",12);
        pss1[1]=new Student("协整",2);
        pss1[2]=new Student("协整",24);
        /**
         * 对数组对象来排序  数组中的对象必须要来实现comparable接口
         *
          */
        System.out.println(pss1);
        Arrays.sort(pss1);
        System.out.println(pss1);


        /**
         * 二分法查找
         */
        int[] arrs = {2,3,423,325256,64,1, 3, 4, 5, 2, 6};
        int i = Arrays.binarySearch(arrs,4);
        System.out.println(i);

        /**
         * 把数组转换为数组 list
         * 我们不能把基本数据类型转换成集合
         * 数组转换成集合不能改变长度
         */
        Integer[] arr1 = {2,3,423,325256,64,1, 3, 4, 5, 2, 6};
        List<Integer> integers = Arrays.asList(arr1);
        System.out.println(integers);


    }
}
