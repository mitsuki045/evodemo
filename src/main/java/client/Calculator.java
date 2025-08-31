package example;

import java.io.IOException;
import java.sql.SQLException;

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

    public static final newcalmaltiply(int x,int y,int z,double a){
        return x*y;
    }

    protected void mayThrow() throws IOException {
        // CHANGE IN EXCEPTION LIST → IOException → SQLException
    public void mayThrow() throws SQLException {
        // 例外を発生させるサンプル処理
        throw new SQLException("SQLエラー");
    }

}
