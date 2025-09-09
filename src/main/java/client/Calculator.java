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
    public int getUserId() {
        return userId;
    }

    // 計算メソッド
    
    
    

    protected double newcalmaltiply(double x){
        return x;
    }
    public double calmaltiply(double x,double y){
        return x*y; 
    }
    
    
    public void mayThrow() throws SQLException {
        // 例外を発生させるサンプル処理
        throw new SQLException("SQLエラー");
    }

    
    protected double  mayThrowInt() throws SQLException {
    // 例外を発生させるサンプル処理
        if (true) {
            throw new SQLException("ファイルエラー");
        }
        return 10; // 例外が発生しなければ返す値
    }

    
}
