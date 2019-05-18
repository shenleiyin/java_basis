package cn.tx.generic;

public class GenericTest<T> {
    //定义泛型
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
