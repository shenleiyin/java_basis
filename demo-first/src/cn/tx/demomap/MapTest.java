package cn.tx.demomap;

import java.util.HashMap;

public class MapTest {
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

    }
}
