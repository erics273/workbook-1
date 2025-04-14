package com.pluralsight;

public class MathApp {

    //this is the main method and where my code will run from
    //all code I am typing for this exercise will be in this method
    public static void main(String[] args) {

        /*

        Create two variables to represent the salary for Bob and Gary, name them bobSalary and
        garySalary. Create a new variable named highestSalary. Determine whose salary is greater
        using Math.max() and store the answer in highestSalary. Set the initial salary variables
        to any value you want. Print the answer (i.e "The highest salary is ...")

         */

        double bobSalary = 55000;
        double garySalary = 100000;

        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("---------------------------------------");

        /*
        Find and display the smallest of two variables named carPrice and truckPrice.
        Set the variables to any value you want.
         */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest price is " + Math.min(truckPrice, carPrice));

        System.out.println("---------------------------------------");

        /*
        3. Find and display the area of a circle whose radius is 7.25
        area = 3.14 x 7.25 x 7.25
         */

        //create a variable to hold our radius
        double cirRadius = 7.25;

        //calculate the area and store the value in a variable called area
        double area = Math.PI * Math.pow(cirRadius, 2);

        //print the output for the user
        System.out.println("The are of the circle with a radius of " + cirRadius + " is: " + area);

        System.out.println("---------------------------------------");

        /*
        Find and display the square root of a variable after it is set to 5.0
         */
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        //using the variable to display the output
        System.out.println("The square root of " + number + "  is:" + squareRoot);

        //doing the math directly inb the println output
        System.out.println("The square root of " + number + "  is:" + Math.sqrt(5.0));

        System.out.println("---------------------------------------");

        /*
        Find and display the distance between the points (5, 10) and (85, 50)
         */
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        //calculate the distance using the formula we googled
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));

        //print out the distance for the user
        System.out.println("The distance is: " + distance);

        System.out.println("---------------------------------------");

        /*
        Find and display the absolute (positive) value of a variable after it is set to -3.8
         */
        double x = -3.8;
        double absValue = Math.abs(x);

        //print out the absolute value
        System.out.println("The absolut value of " + x + " is: " + absValue);

        System.out.println("---------------------------------------");

        /*
        Find and display a random number between 0 and 1

         */

        //use Math.random to generate a number between 0 and 1
        System.out.println("A random number between 0 and 1 is: " + Math.random());

    }



}
