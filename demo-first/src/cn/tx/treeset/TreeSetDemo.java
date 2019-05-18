package cn.tx.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    /**
     * TreeSet 不允许为 null
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        Student s = new Student("z1cvzcab", 12);
        Student s1 = new Student("az1cvzcab", 12);
        set.add(s);
        set.add(s1);
        System.out.println(set);
    }
}
