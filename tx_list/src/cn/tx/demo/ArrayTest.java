package cn.tx.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {

        Object[] object = {new Student(1), new Student(2), new Student(3)};

        //定义集合
        List list = new ArrayList();
        list.add(new Student(1));
        list.add(new Student(2));
        list.add(new Student(3));
        list.add(new Student(4));
        list.add(new Student(5));

        System.out.println(list);
        System.out.println(list.size());

        Student o =(Student) list.get(1);
        System.out.println(o);

        System.out.println("---------------------");
        for (int i = 0; i < list.size(); i++) {
            Student s1 =(Student) list.get(i);
            System.out.println(s1);
        }




    }
}
