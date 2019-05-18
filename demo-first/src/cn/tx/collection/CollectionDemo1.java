package cn.tx.collection;

import cn.tx.array.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Student s = new Student(1,"小雷",20);
        //或取这个学生的集合
        Collection books = s.getBooks();
        books.add(new Book("天龙八部",30));


        Student s1 = new Student(2,"小明",29);
        Collection books1 = s.getBooks();
        books1.add(new Book("天龙八部",30));
        c.add(s);
        c.add(s1);
        System.out.println(c);

    }

}

