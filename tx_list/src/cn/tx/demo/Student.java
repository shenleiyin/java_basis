package cn.tx.demo;

public class Student {
    private int sNo;

    public Student(int sNo) {
        this.sNo = sNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                '}';
    }
}
