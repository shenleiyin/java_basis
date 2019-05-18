package cn.tx.demo01;

public class Persons {
    private String name;
    private int age;

    //构造器
    public Persons(String name, int age) throws ValidPersonException {
        this.name = name;
        if (age>0&&age<200) {
            this.age = age;
        }else {
            throw new ValidPersonException("未处理的人年龄的异常");
        }
    }

    //封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
