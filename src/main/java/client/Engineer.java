package example;
  
public class Engineer extends Calculator {
    /**
     * スキル
     */
    private String Skill;

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
    public String getSkill() {
        return Skill;
    }
}
