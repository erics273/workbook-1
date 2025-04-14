package com.pluralsight;

public class FormattingDemo {

    public static void main(String[] args) {

        //create a variable to hold a dollar amount
        double dollarAmount = 27.987162;
        String name = "eric";

        //print the dollar amount to the screen using println
        System.out.println("$" + dollarAmount);

        //print the dollar amount to the screen using println
        System.out.printf("the dollar amount is $%.2f %s was here %s %d 5%%%n", dollarAmount, name, "pizza", 10);

        //same thing with String.format
        System.out.println(String.format("the dollar amount is $%.2f %s was here %s %d 5%%", dollarAmount, name, "pizza", 10));


    }

}
