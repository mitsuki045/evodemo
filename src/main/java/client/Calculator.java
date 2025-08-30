package example;

class Calculator {
    public void foo() {
        System.out.println("foo in Calculator (superclass)");
    }
}

class AdvancedCalculator extends Calculator {
    // まだfoo()はここには存在しない
}

