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
    
    
    public int minus(int a,int b){
        return a-b;
    }

    public int calminus(int x, int y) {
        return minus(x,y); 
    }

    public int maltiply(int a,int b){
        return a*b;
    }

    public int calmaltiply(int x, int y){
        return maltiply(x,y);
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
