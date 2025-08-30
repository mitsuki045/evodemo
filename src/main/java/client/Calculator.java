package example;

public class Calculator {
    private int userId;

    // セッター
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // ゲッター
    protected int getUserId() {
        return userId;
    }

    // 計算メソッド
    
    
    public int minus(int a, int b) {
        return a - b;
    }

    public int calminus(int x, int y) {
        return minus(x, y); // multiply() を呼び出し
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int calmaltiply(int x, int y){
        return multiply(x,y);
    }

}
