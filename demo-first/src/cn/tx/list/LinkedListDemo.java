package cn.tx.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        /**
         * LinkedList 是链表未原里  添加修改删除性能高
         */
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("张四");
        list.add("张五");

        //addFirst
        list.addFirst("你好");
        System.out.println(list);

        /**
         * addList  在末尾添加
         * removeFirst
         * removeLiast
         * pop  出栈
         * push 压栈
         *
         */


    }
}
