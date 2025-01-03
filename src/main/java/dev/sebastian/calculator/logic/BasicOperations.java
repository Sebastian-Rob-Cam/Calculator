package main.java.dev.sebastian.calculator.logic;

public class BasicOperations {
    private static double result = 0;

    public static double add(double a, double b) {
        System.out.println("running add");
        result = a + b;
        return result;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
