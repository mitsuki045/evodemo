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
    
    
    public double caltwo(double a,int b, int c){
        if(c>a) return 100+c;
        if(b>a) return 50+c; 
        return 0+c;
    }

    protected static final int newcalmaltiply(int x,int y){
        return x*y;
    }

    

}
