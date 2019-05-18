package cn.tx.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

       //创建一个集合 Collection
        Collection coll = new ArrayList();
        //向集合中添加元素
        coll.add("小明");
        coll.add("小明");
        coll.add("小明");
        coll.add("小明");

        int size = coll.size();
        System.out.println(size);


        /**
         * addAll
         * 将指定的collection中的元素添加在别的collection中
         *
         * clear()
         * 清空所有元素
         *
         * remove()
         * 从集合中删除一个元素
         *
         * removeAll()
         * 批量删除
         *
         * contains()
         * 判断是否包含某个元素
         *containsAll() 一个集合元素是否包含
         *
         * isEpty()
         * 判断是否为空
         *
         * 把机集合转换成数组
         * toArray()
         *
         *
         *
         *
         */
interCollection(coll);

    }

    /**
     * 集合遍历方法
     */
    public static void interCollection(Collection coll){

        //获得一个集合的迭代器对象 迭代器的指针是一去不复返的
        Iterator iterator = coll.iterator();
        //我们通过迭代器对象来遍历集合
        while (iterator.hasNext()){
            //获得这个元素 Object是一个根类
//            Object next = iterator.next();
            String next = (String)iterator.next();
            //打印元素
            System.out.println(next);
        }

    }
}
