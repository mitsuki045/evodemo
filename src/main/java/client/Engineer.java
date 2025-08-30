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

    /**
     * スキル取得
     */

    public void SetUserId(int userID) {
        this.UserId = userID;
    }

    public final double newadd (int a,double b){
        return a+b;
    }
    
    

    protected String getSkill() {
        return Skill;
    }
    

}
