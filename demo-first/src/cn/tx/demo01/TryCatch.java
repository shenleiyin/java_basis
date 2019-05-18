package cn.tx.demo01;

public class TryCatch {

    public static void main(String[] args) {
        dvide(10, 0);
        int result = 0;
        try {
            //接受异常对象
            result = dvide(10, 0);
        } catch (Exception e) {
            //获得异常的信息
            String message = e.getMessage();
            System.out.println(message);
            //获得异常的详细信息
            String s = e.toString();
            System.out.println(s);

            //打印异常超级详细信息
            e.printStackTrace();
        }


    }

    /**
     * try ... catch   快捷键 ctrl+ alt + T
     */


    public static int dvide(int a, int b) {
        int c = 0;
        /**
         * 多异常处理
         */
        int[] arr = {1, 2, 34, 525};
        try {
            c = a / b;
            System.out.println(arr[100]);
            //ArithmeticException 更加详细
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return c;
    }
}
