package cn.tx.param;

public class DynamicParamDemo {
    public static void main(String[] args) {
        /**
         * 可变参数
         */
        int result = add(10,12,3,21);
        System.out.println(result);
        int add = add(new int[]{10, 20});
        System.out.println(add);

    }

    //可变参数
    /**
     * 数据类型... 变量这是可变参数的定义方式
     * 可以代表数组 ， 还可代表单个数的传递
     */
    public static int add(int... a){
        int total=0;
        for (int i = 0; i < a.length; i++) {
           total+=a[i];
        }
        return total;
    }
}
