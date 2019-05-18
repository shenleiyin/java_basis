package cn.tx.demo01;

import java.util.Scanner;

public class Demo1 {

    public static double getArea(double r) {
        double area = 0;
        if (r <= 0) {
            throw new ValidDataException("半径不可以是0或者小于0的数");
        }
        area = Math.PI * r * r;

        return area;
    }

    public static void inpoutR() {
        //定义扫苗器
        Scanner scanner = new Scanner(System.in);
        //获得输入的值
        int r = scanner.nextInt();
        //定义面积变量
        double area = 0;
        try {
            //计算结果
            area = getArea(r);
            //输出结果
            System.out.println("圆的面积是：" + area);
        } catch (Exception e) {
            //发生异常
            if (e instanceof ValidDataException) {
                //提示错误信息
                System.out.println("传递的参数错误,请重新输入R");
//                r = scanner.nextInt();
//                area = getArea(r);
//                System.out.println("圆的面积是：" + area);

                //递归方式的调用
                inpoutR();
            }
        }
    }

    public static void main(String[] args) {
        inpoutR();

    }
}
