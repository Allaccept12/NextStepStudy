package com.example.calculator;

public class CalculatorTest {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        addTest(calculator);
        minusTest(calculator);
        multiplyTest(calculator);
        divideTest(calculator);
    }

    public static void addTest(Calculator calculator) {
        System.out.println("calculator.add = " + calculator.add(3,4));
    }
    public static void minusTest(Calculator calculator) {
        System.out.println("calculator.add = " + calculator.add(3,4));
    }
    public static void multiplyTest(Calculator calculator) {
        System.out.println("calculator.add = " + calculator.add(3,4));
    }
    public static void divideTest(Calculator calculator) {
        System.out.println("calculator.add = " + calculator.add(3,4));
    }
}
