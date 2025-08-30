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
    

    /**
     * ユーザID取得
     * @return
     */
    public void SetUserId(int userID) {
        this.UserId = userID;
    }

     public int minus(int a, int b){
        if (a<0) a+100;
        return a-b;
    }
    
    
}
