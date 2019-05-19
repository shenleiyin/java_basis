package cn.tx.demoFile;

public class FileDemo4 {
    public static void main(String[] args) {

        int result=fn(5);
        System.out.println(result);
    }

    //求一个数的递归
    public static int fn(int num) {
        int result=1;
        if (num>1)
            //方法的自身调用
            result=num*fn(num-1);
        return result;
    }
}
