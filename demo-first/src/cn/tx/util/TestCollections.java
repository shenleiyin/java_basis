package cn.tx.util;

import cn.tx.array.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student(1, "张三", 34));
        sList.add(new Student(2, "张三", 324));
        sList.add(new Student(3, "张三", 341));
        sList.add(new Student(3, "张三", 341));

        System.out.println(sList);
        //集合反转
        Collections.reverse(sList);
        System.out.println(sList);
        System.out.println("--------------------------");
        //打乱集合
        Collections.shuffle(sList);
        System.out.println(sList);

        System.out.println("--------------------------");
        //排序
        Collections.sort(sList);
        System.out.println(sList);

        /**
         * 可以通过外部比较器来排序
         */

        /**
         * Collection 集合体系里面只有Vector是线程安全的
         */
//把不安全的变为集合安全的
        Collections.synchronizedList(sList);


    }

}
