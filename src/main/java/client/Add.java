// add.java
class Onegai {
    void hello() {
        System.out.println("Xのメソッド");
    }
}

class Z {
    void hello() {
        System.out.println("Zのメソッド");
    }
}

class B extends Z {
    void greet() {
        System.out.println("Bのメソッド");
    }
}

public class Add {  // このファイルの public クラス（ファイル名と同じにする）
    public static void main(String[] args) {
        B b = new B();
        b.hello(); // X のメソッドも使える
        b.greet(); // B のメソッド
    }
    
}
