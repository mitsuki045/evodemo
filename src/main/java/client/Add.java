// add.java
class X {
    void hello() {
        System.out.println("Xのメソッド");
    }
}

class Y {
    void hello() {
        System.out.println("Yのメソッド");
    }
}

class B extends Y {
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
    public int add(int x,int y){
        return a;
    }
}
