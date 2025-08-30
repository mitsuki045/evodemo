package example;

public class Engineer extends Calculator {
    private String skill;

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    protected final int add(int a, int b) {
        return a + b;
    }
    // Calculator の protected フィールド・メソッドは使用可能
    public int calculateSum(int a, int b) {
        return add(a, b); // 親クラスの add メソッドを使用
    }
}
