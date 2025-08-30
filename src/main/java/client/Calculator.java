package example;

class Calculator {
    // foo() はここから削除された
}

class AdvancedCalculator extends Calculator {
    @Override
    public void foo() {
        System.out.println("foo in AdvancedCalculator (subclass)");
    }
}
