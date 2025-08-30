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
    
    

    protected static final int newcalminus(int x, int y) {
        return x-y; 
    }


    public int calmaltiply(int x, int y){
        return x*y;
    }

    public int twocho(int x,int y){
        if(x>y) return 100;
        if(y>x) return 50; 
        return 0;
    }

    public int caltwo(int a,int b, int c){
        int n;
        n=twocho(a,b);
        return n+c;
    }

}
