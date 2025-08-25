package com.acme.calc;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }

    public double sqrt(double a) {
        if (a < 0) throw new IllegalArgumentException("Negative sqrt");
        return Math.sqrt(a);
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
