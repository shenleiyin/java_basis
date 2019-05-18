package cn.tx.demo01;

public class TryCatchDeam1 {
    public static void main(String[] args) {
        divide(10,3);
    }

    public static int divide(int a,int b){
        int c = 0;
        int[] arr = {2,53,32,5,23};
        try {
            c=a/b;
            System.out.println(arr[100]);
        } catch (Exception e) {
            if(e instanceof ArithmeticException){
                System.out.println("被零除");
            }
            if (e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("数组越界");
            }
            e.printStackTrace();
        }

        return  c;
    }


}
/**
 * try...finaly 发生异常抛出异常
 *
 * try...catch...finaly
 */
