package example;

public abstract class Abstract {
    public int add(int a, int b) {
        return a + b;
    }

    // ここでは掛け算の処理を抽象メソッドにする
    public abstract int multiply(int a, int b);
}

