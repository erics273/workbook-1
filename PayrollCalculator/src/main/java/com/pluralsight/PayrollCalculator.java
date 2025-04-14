package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        //create a scanner to collect user input
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        //get the name from the user and store it in the name variable
        String name = myScanner.nextLine();

        //asked the hours worked
        System.out.println("Enter Hours Worked");

        //get the hours worked entered and store it in hoursWorked
        double hoursWorked = myScanner.nextDouble();

        //asked the hours worked
        System.out.println("What is the pay rate? ");

        //get the hours worked entered and store it in hoursWorked
        double payRate = myScanner.nextDouble();

        //calculate the gross pay
        double grossPay = hoursWorked * payRate;

        //output with printf
        System.out.printf("%s made $%.2f in gross pay", name, grossPay);

        //output with println
        System.out.println(name + " made $" + grossPay + " in gross pay");

    }

}