// ファイル: example/Calculator.java
package example;

import java.sql.SQLException;

public class Calculator {

    // REMOVE METHOD → 削除

    // LOST VISIBILITY → public → protected
    public void newpublicMethod() {
        System.out.println("public method");
    }

    // CHANGE IN RETURN TYPE → int → double
    public int newreturnInt() {
        return 42;
    }

    // CHANGE IN PARAMETER LIST → (int,int) → (double,int)
    public double newaddNumbers(double a, double b) {
        return  a + b;
    }

    // CHANGE IN EXCEPTION LIST → IOException → SQLException
    public void newmayThrow() throws IOException {
        throw new IOException("error");
    }

    // ADD FINAL MODIFIER
    public final void newoverridable() {
        System.out.println("cannot override");
    }

    // REMOVE STATIC MODIFIER
    public void newstaticMethod() {
        System.out.println("instance method now");
    }

    // MOVE METHOD → 別クラスに移動（このクラスからは削除）

    // RENAME METHOD → renameMe → renamed
    public void renamed() {
        System.out.println("new name");
    }

    // PUSH DOWN METHOD → SubCalculator へ移動（ここから削除）

    // INLINE METHOD → inlineCallee 削除して inlineCaller に展開
    public void newinlineCaller() {
        System.out.println("callee executed");
    }
}

// MOVE METHOD 用の別クラス
package example;
public class Utils {
    public void moveMe() {
        System.out.println("moved method");
    }
}

// PUSH DOWN METHOD 用のサブクラス
package example;
public class SubCalculator extends Calculator {
    @Override
    public void pushDown() {
        System.out.println("moved to subclass");
    }
}

