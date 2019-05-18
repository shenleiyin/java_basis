package cn.tx.demo01;

/**
 * 主动的抛出异常的语法
 * throw new StockException("库存不足"+stock);
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            submitOrder(7);
        } catch (Exception e) {
            System.out.println("我知道库存不足");
            submitOrder(5);
//            e.printStackTrace();
        }
    }

    public static void submitOrder(int stock){

        if (stock>5){
            //抛出自定义异常
            throw new StockException("库存不足"+stock);
        }

        System.out.println("购买成功");
    }
}
