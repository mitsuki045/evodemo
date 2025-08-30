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
    
    
    public int caltwo(int a,int b, int c){
        if(a>b) return 100+c;
        if(b>a) return 50+c; 
        return 0+c;
    }

}
