package cn.tx.demo01;

public class Demo2 {
    public static void main(String[] args) {
        try {
            Persons persons = new Persons("小雷", 0);
            System.out.println(persons);
        } catch (ValidPersonException e) {
            e.printStackTrace();

        }
    }
}
