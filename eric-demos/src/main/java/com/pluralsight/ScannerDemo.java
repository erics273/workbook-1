package com.pluralsight;

//import the Scanner from the java.util package for us to use
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        //create a scanner for us to use
        Scanner myScanner = new Scanner(System.in);

        //ask the user a question
        System.out.print("Enter your name: ");

        //waits for the user to type something and hit enter
        String name = myScanner.nextLine();

        //make some attempt to validate the data
        if(name.trim().equals("")){
            System.out.println("you didn't give me a valid name");
        }

        //say hello to the user
        System.out.println("Howdy " + name + "!");

        //ask the user another question
        System.out.println("How old are you? ");

        //store the age they typed in a variable called age
        int age = myScanner.nextInt();

        //this eats the leftover carriage return from the nextInt scanner so that it doesn't
        //get treated as the next user input
        myScanner.nextLine();

        //print out information related to the age provided
        System.out.println("Wow, you look great for  " + age + "!");

        //ask the user another question
        System.out.println("What is your favorite color? ");

        //waits for the user to type something and hit enter
        String color = myScanner.nextLine();

        System.out.println("Awesome " + color + " is my favorite as well") ;

    }

}
