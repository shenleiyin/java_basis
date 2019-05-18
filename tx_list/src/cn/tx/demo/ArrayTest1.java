package cn.tx.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest1 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1));
        list.add(new Student(2));


        /**
         * 增强for循环 list.for 快捷键
         */
        for (Student student : list) {
            System.out.println(student);
        }

        int[] arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
