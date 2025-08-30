package example;
  
public class Engineer extends Calculator {
    /**
     * スキル
     */
    private String Skill;

    public int GetUserId() {
        return UserId;
    }
    /**
     * スキル設定
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

     public void SetUserId(int userID) {
        super.UserId = userID;
    }
    /**
     * スキル取得
     */


    public final double newadd (int a,double b){
        return a+b;
    }
    
     public void SetUserId(int userID) {
        super.UserId = userID;
    }
    

    protected String getSkill() {
        return Skill;
    }
    

}
