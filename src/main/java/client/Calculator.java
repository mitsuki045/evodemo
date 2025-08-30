package example;

public class Calculator {
    // foo() はここから削除された
}

public class AdvancedCalculator extends Calculator {
    @Override
    public void foo() {
        System.out.println("foo in AdvancedCalculator (subclass)");
    }
}
