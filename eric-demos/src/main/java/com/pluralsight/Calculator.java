package com.pluralsight;

public class Calculator {

    static final double PI = 3.14;


    //private constructor so we cant even make an instance
    private Calculator() {
    }

    //static methods
    static int add(int number1, int number2){
        return number1 + number2;
    }

    static int subtract(int number1, int number2){
        return number1 - number2;
    }

    static int divide(int number1, int number2){
        return number1 / number2;
    }

    static int multiply(int number1, int number2){
        return number1 * number2;
    }

}
