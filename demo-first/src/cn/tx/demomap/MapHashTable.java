package cn.tx.demomap;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapHashTable {
    /**
     * HashTable是map的实现类
     * HashTable是线程安全的
     * 不能有null
     */
    public static void main(String[] args) {
        //创建一个Map 集合
        Hashtable<String , String > map = new Hashtable<>();
        map.put("a", "你好--");
        map.put("b", "你");
        map.put("d", "你--好");
        System.out.println(map);


        /**
         *LinkedHashMap s是有顺序的
         */
        LinkedHashMap<Object, Object> linkmap = new LinkedHashMap<>();



    }
}
