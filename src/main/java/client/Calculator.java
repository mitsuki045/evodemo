package example;

public class Calculator {
    /**
     * ユーザID
     */
    private int UserId;

    /**
     * ユーザID設定
     * @param userID
     */
    public void SetUserId(int userID) {
        this.UserId = userID;
    }

    /**
     * ユーザID取得
     * @return
     */
    public int add (int a,int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    
}
