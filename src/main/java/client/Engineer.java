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

    protected String getSkill() {
        return Skill;
    }

    public static final int minus(double a, int b){
        if (a<0) a+100;
        return a-b;
    }
    

}
