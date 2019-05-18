package cn.tx.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //Vector 底层也是数组  线层安全
        Vector vector = new Vector();
        vector.add("张三");
        vector.add("张1");
        vector.add("张2");
        vector.add("张3");

        System.out.println(vector);

        for (int i = 0; i < vector.size(); i++) {
            Object o = vector.get(i);
            System.out.println(o);
        }


    }
}
