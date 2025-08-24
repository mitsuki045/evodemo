// ファイル: example/Calculator.java
package example;

import java.io.IOException;

public class Calculator {

    // REMOVE METHOD 対象
    public int add(int a, int b) {
        return a + b;
    }

    // LOST VISIBILITY 対象
    public void publicMethod() {
        System.out.println("public method");
    }

    // CHANGE IN RETURN TYPE 対象
    public int returnInt() {
        return 42;
    }

    // CHANGE IN PARAMETER LIST 対象
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // CHANGE IN EXCEPTION LIST 対象
    public void mayThrow() throws IOException {
        throw new IOException("error");
    }

    // ADD FINAL MODIFIER 対象
    public void overridable() {
        System.out.println("can override");
    }

    // REMOVE STATIC MODIFIER 対象
    public static void staticMethod() {
        System.out.println("static method");
    }

    // MOVE METHOD 対象
    public void moveMe() {
        System.out.println("moved method");
    }

    // RENAME METHOD 対象
    public void renameMe() {
        System.out.println("old name");
    }

    // PUSH DOWN METHOD 対象
    public void pushDown() {
        System.out.println("in superclass");
    }

    // INLINE METHOD 対象
    public void inlineCaller() {
        inlineCallee();
    }

    public void inlineCallee() {
        System.out.println("callee executed");
    }
}

// PUSH DOWN METHOD 用のサブクラス
package example;
public class SubCalculator extends Calculator {
}
