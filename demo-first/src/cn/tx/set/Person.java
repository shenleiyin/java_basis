package cn.tx.set;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    /**
     * ctrl + o 重写父类方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        boolean isEq = false;
        Person p = (Person) obj;
        if (obj instanceof  Person){
            if (this.name!=null && p.name!=null && this.age == p.age && this.name.equals(p.name) ){
                isEq=true;
            }
        }
        //调用父类
//        return super.equals(obj);
        return isEq;
    }

    //重写父类
    @Override
    public int hashCode() {
        //调用父类
//        return super.hashCode();
        return 1;
    }
}
