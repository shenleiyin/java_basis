package cn.tx.demo01;

public class ValidDataException extends RuntimeException {
    /**
     * 继承父类构造器
     */
    public ValidDataException() {
        super();
    }

    public ValidDataException(String message) {
        super(message);
    }

    public ValidDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidDataException(Throwable cause) {
        super(cause);
    }

    protected ValidDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
