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
    
    
    public final double newcaltwo(double a,int b, int c){
        if(c>a) return 100+c;
        if(b>a) return 50+c; 
        return 0+c;
    }

    public final int newcalmaltiply(int x,int y){
        return x*y;
    }
    
    protected final void mayThrow() throws SQLException {
        // 例外を発生させるサンプル処理
        throw new SQLException("SQLエラー");
    }

    public int mayThrowInt() throws SQLException {
    // 例外を発生させるサンプル処理
        if (true) {
            throw new SQLException("SQLエラー");
        }
        return 10; // 例外が発生しなければ返す値
    }

    
}
