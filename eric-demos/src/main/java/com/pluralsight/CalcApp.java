package com.pluralsight;

public class CalcApp {

    public static void main(String[] args) {

        //test my static method, add, in my calculator
        int sum = Calculator.add(2, 2);
        System.out.println(sum);

        //test my static method, add, in my calculator
        int difference = Calculator.subtract(2, 2);
        System.out.println(difference);

        System.out.println(Calculator.PI);


    }

}
