package cn.tx.list;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList list = new ArrayList();
        //想集末尾添加元素
        list.add("小明");
        list.add("张三");
        list.add("李四");
        list.add("王五");

        //根据索引号删除元素 返回删除的元素
        Object remove = list.remove(2);
        System.out.println(remove);
        System.out.println(list);

        //根据元素去删除
        list.remove("小明");
        System.out.println(list);

        /**
         * removeAll 删除一个集合的元素
         * clear  清空
         */




    }
}
