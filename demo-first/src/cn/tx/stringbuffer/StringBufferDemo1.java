package cn.tx.stringbuffer;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        //创建一个可变的字符串对象
        StringBuffer sb = new StringBuffer("abc");
        //在原有的字符串上追加
        StringBuffer hello = sb.append("hello");
        System.out.println(hello==sb);
        /**
         * StringBuffer 线层安全
         */

    }
}
