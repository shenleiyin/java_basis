package cn.tx.demomap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    /**
     *
     */
    public static void main(String[] args) {

        //创建一个Map 集合
        HashMap<String, String> map = new HashMap<>();
        map.put("a","你好");
        map.put("b","你好");
        map.put("c","你");
        map.put("d","你好吗");
        /**
         * key 只能有一个是null  。值任意
         */
        System.out.println(map);

        /**
         * 想集合总价元素
         * putAll
         *
         * 清空
         * clear
         *
         * remove
         * 删除
         *
         * get
         * 根据key获得功能
         *
         */

        //获得一个map 的集合的key的set集合  keySet
        Set<String> objects = map.keySet();
        System.out.println(objects);

        //遍历map 集合
        for (Object object : objects) {
            Object valul = map.get(object);
            System.out.println(object+"=========>"+valul);
        }

        //判读map 集合是否包含指定的key
        boolean b = map.containsKey("b");
        System.out.println(b);

        //判读集合是否包含指定的值
        boolean you = map.containsValue("你");
        System.out.println(you);

        //判读集合是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty);

        //遍历 entrySet
        System.out.println("-------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry:entries){
            //获得集合map 的key
            Object key = entry.getKey();
            //获得map集合的value
            Object value = entry.getValue();
            System.out.println(key+"----"+value);
        }

        //变成线程安全的
        Collections.synchronizedMap(map);


    }
}
