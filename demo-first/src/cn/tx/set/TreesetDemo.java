package cn.tx.set;

public class TreesetDemo {
    public static void main(String[] args) {
        /**
         * 排序 比较等应用
         *compareTo 实现排序规则
         */
        String str = "bbcafdsf";
        String str1="abcd";
        // 字符串的比较规则是先按第一个字符来比较，如果第一个字符串比另外一个首字母字符串大，那么前着大
        //如果是整数说明str大 负数 str1大 如果为0 相等
        int i = str1.compareTo(str);
        System.out.println(i);
    }
}
