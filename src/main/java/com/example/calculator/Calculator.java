package com.example.calculator;

public class Calculator {

    int add(int i, int j) {
        return i + j;
    }

    int minus(int i, int j) {
         return i-j;
    }

    int multiply(int i, int j) {
        return i*j;
    }

    int divide(int i, int j) {
        return i/j;
    }

    // Next Step에서는 main()코드의 목적은 테스트 코드라고 함.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("calculator.add = " + calculator.add(3,4));
        System.out.println("calculator.minus = " + calculator.minus(5,4));
        System.out.println("calculator.multiply = " + calculator.multiply(2,6));
        System.out.println("calculator.divide = " + calculator.divide(8,4));
    }
}
