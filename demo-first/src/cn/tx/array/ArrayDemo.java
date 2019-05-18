package cn.tx.array;

public class ArrayDemo {
    public static void main(String[] args) {

        //创建一个10个长度的学生类型的数组
        Student[] students=new Student[10];
        for (int i = 0; i < 10; i++) {
            //创建一个学生对象
            Student s = new Student(i, "小雷" + i, 20);
           //把学生放在数组中
            students[i]=s;
        }
        printArr(students);
        System.out.println("----------------");
        Student s = new Student(1,"ab",12);
        Student ss = new Student(1,"ab",20);
        int i = s.compareTo(ss);
        System.out.println(i);


    }

    /**
     * 打印数组
     * @param students
     */
    public static void printArr(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
