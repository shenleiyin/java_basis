package cn.tx.array;

import java.util.ArrayList;
import java.util.Collection;

public class Student implements Comparable<Student> {
    private Integer stuNo;
    private String naem;
    private int age;

    //学生集合中有一个集合
    private Collection books = new ArrayList();

    public Collection getBooks() {
        return books;
    }

    public void setBooks(Collection books) {
        this.books = books;
    }

    public Student(Integer stuNo, String naem, int age) {
        this.stuNo = stuNo;
        this.naem = naem;
        this.age = age;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", naem='" + naem + '\'' +
                ", age=" + age +
                ", books=" + books +
                '}';
    }


    // alt + Enter 定义方法
    @Override
    public int compareTo(Student o) {
        int flag = this.age - o.age;
        if (flag == 0) {
            flag = this.naem.compareTo(o.naem);
        }
        return flag;
    }
}
