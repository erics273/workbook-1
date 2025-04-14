package com.pluralsight;


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        //fire up the scannner to allow me to collect input from the user
        Scanner myScanner = new Scanner(System.in);

        //let's greet our user
        System.out.println("Welcome to my addition machine!");

        //ask the user for the first number
        System.out.println("What is the first number we are going to add? ");
        int num1 = myScanner.nextInt();


        //ask the user for the second number
        System.out.println("What is the second number we are going to add? ");
        int num2 = myScanner.nextInt();

        //do the math
        int sum = addNumbers(num1, num2);

        //display the sum to the user
        System.out.println("The sum is: " + sum);


    }

    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

}
