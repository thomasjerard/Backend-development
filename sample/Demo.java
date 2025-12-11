package sample;
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calc calc = new Calc();
        calc.display();
        calc.math = 10;
        System.out.println("Math value: " + calc.math);
    }
}