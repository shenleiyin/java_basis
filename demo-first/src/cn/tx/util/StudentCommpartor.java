package cn.tx.util;

import cn.tx.treeset.Student;

import java.util.Comparator;

public class StudentCommpartor implements Comparator<Student> {

    /** 比较器*****
     * 排序实现Comparator 接口
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Student o1, Student o2) {
        int flag = o1.getAge()-o2.getAge();
        if (flag==0){
            flag=o1.getNam().compareTo(o2.getNam());
        }
        return flag;
    }


}
