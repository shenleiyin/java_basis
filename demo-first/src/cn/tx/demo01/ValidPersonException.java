package cn.tx.demo01;

public class ValidPersonException extends Exception{
    //CTRL+o
    public ValidPersonException() {
        super();
    }

    public ValidPersonException(String message) {
        super(message);
    }

    public ValidPersonException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidPersonException(Throwable cause) {
        super(cause);
    }

    protected ValidPersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
