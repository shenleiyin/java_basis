package cn.tx.demomap;

import java.util.HashMap;

public class MapTest2 {
    public static void main(String[] args) {

        //创建一个Map 集合
       HashMap<Person, String> map = new HashMap<>();
       map.put(new Person("小明",23),"你好--");
       map.put(new Person("小明",27),"你");
       map.put(new Person("小明",21),"你--好");

       System.out.println(map);

    }
}
