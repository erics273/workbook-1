package com.pluralsight;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFileTryCatch {

    public static void main(String[] args) {

        String[] names = { "Ezra", "Elisha", "Ian", "Siddalee", "Pursalane", "Zephaniah" };

        //this try catch will help us give a nicer message to the user rathr than crashing
        //when the index is out of bounds
        try {
            //print out a name from the array
            System.out.println(names[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Sorry, that doesn't exist on the list, have a nice day");
        }

        System.out.println("I made it here because my app is still running even after an exception");

        try {
            //create file input stream that kinda brings our file into our code
            //i put the file in the resources folder because technically thats where it should be
            FileInputStream fis = new FileInputStream("src/main/resources/eric.txt");
            Scanner fileScanner = new Scanner(fis);

            //loop that checks to make sure we have a line or next lines in our file
            //prints the lines out if they exist
            while(fileScanner.hasNextLine()) {
                //print out each line in the file
                System.out.println( fileScanner.nextLine() );
            }

        }catch (Exception e){
            System.out.println("That file did not exist");
        }

        try {

            String fileName = "inventory.csv";
            //create file input stream that kinda brings our file into our code
            //i put the file in the resources folder because technically thats where it should be
            FileInputStream fis1 = new FileInputStream("src/main/resources/" + fileName);
            Scanner fileScanner1 = new Scanner(fis1);

            //loop that checks to make sure we have a line or next lines in our file
            //prints the lines out if they exist
            int lineNumber = 1;
            while(fileScanner1.hasNextLine()) {
                //print out each line in the file
                System.out.println(lineNumber + ": " + fileScanner1.nextLine() );
                lineNumber++;
            }

        }catch (Exception e){
            System.out.println("That file did not exist");
        }

    }

}
