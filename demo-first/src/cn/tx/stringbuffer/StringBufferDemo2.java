package cn.tx.stringbuffer;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        //创建一个空的字符串对象
        StringBuffer sb = new StringBuffer();
        //获得容量
        int capacity = sb.capacity();
        System.out.println(capacity);
    }
}
