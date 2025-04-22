package com.pluralsight;

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
    }

}
