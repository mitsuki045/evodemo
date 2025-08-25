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

    protected void moveMe() {
        System.out.println("moved method");
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

    

    // RENAME METHOD 対象
    public void renameMe() {
        System.out.println("old name");
    }

    

    // INLINE METHOD 対象
    public void inlineCaller() {
        inlineCallee();
    }

    public void inlineCallee() {
        System.out.println("callee executed");
    }
}



package example;
public class SubCalculator extends Calculator {
    @Override
    public void pushDown() {
        System.out.println("moved to subclass");
    }
}


