package cn.tx.demo01;

/**
 * 运行时候的异常
 * <p>
 * 自定义异常  必须继承RuntimeException
 */
public class StockException extends RuntimeException {
    /**
     * 重写父类方法 ctrl + o   快速重写父类方法
     * <p>
     * 在类中继承RuntimeException 的构造器即可
     */
    public StockException() {
        super();
    }

    public StockException(String message) {
        super(message);
    }

    public StockException(String message, Throwable cause) {
        super(message, cause);
    }

    public StockException(Throwable cause) {
        super(cause);
    }

    protected StockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
