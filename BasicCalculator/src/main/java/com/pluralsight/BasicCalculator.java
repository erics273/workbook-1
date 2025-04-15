package com.pluralsight;

//import the Scanner from java.util so we can use it
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        //create an instance of the scanner so we can use it to get user input
        Scanner myScanner = new Scanner(System.in);

        //ask the user for the first number
        System.out.print("Enter the first number: ");

        //stop the application and wait for the user to answer the above question and hit enter
        int firstNumber = myScanner.nextInt();

        //ask the user for the second number
        System.out.print("Enter the second number: ");

        //stop the application and wait for the user to answer the above question and hit enter
        int secondNumber = myScanner.nextInt();

        //eats up the extra LF (the press of enter) from the above scanner nextInt()
        myScanner.nextLine();

        //display menu for type of calculations
        System.out.println("Possible calculations: ");
        System.out.println("    (A)dd ");
        System.out.println("    (S)ubstract ");
        System.out.println("    (M)ultiply ");
        System.out.println("    (D)ivide ");
        System.out.print("Please select an option: ");

        //captures the answer to the question above
        String userChoice = myScanner.nextLine();

        System.out.println("The user chose " + userChoice);

        int result = 0;
        String operator = "";

        if(userChoice.equalsIgnoreCase("M")){
            operator = "*";
            result = multiplyNumbers(firstNumber, secondNumber);
        } else if (userChoice.equalsIgnoreCase("A")) {
            operator = "+";
            result = addNumbers(firstNumber, secondNumber);
        } else if (userChoice.equalsIgnoreCase("S")) {
            operator = "-";
            result = subtractNumbers(firstNumber, secondNumber);
        } else if (userChoice.equalsIgnoreCase("D")) {
            operator = "/";
            result = divideNumbers(firstNumber, secondNumber);
        }else{
            System.out.println("Bad choice try again");
        }


        //lets figure out the product of the two numbers multiplied together
//        int product = multiplyNumbers(firstNumber, secondNumber);

        //print out the answer to the user.
        System.out.println(firstNumber + "  " + operator + " " + secondNumber + " = " + result);


    }

    public static int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }

    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }

    public static int divideNumbers(int num1, int num2){
        return num1 / num2;
    }

}
