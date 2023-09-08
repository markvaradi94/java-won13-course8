package ro.fasttrackit.course8.overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1.5, 2.9));
    }
}
