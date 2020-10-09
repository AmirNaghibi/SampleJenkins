package src.main.java;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int mul(int a, int b){
        return a * b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("1234 + 66 = ");
        System.out.println(calculator.sum(1234, 66));
    }
}