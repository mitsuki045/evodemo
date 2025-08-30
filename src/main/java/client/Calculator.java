
package package1;

public class User {
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
    public int GetUserId() {
        return UserId;
    }
}
