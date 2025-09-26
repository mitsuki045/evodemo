package example;

public class AdvancedCalculator extends Dast {
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    public int add(int a,int b){
        return a+b+10;
    }

    public int trash(int a,int b){
        return a-100-b;
    }
}
