package cn.tx.treeset;

public class Student implements Comparable<Student> {
    String nam;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "nam='" + nam + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String nam, int age) {

        this.nam = nam;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int flag = this.age-o.age;
        if (flag==0){
            flag=this.nam.compareTo(o.nam);
        }
        return flag;
    }
}
