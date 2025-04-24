package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPlayground {

    public static void main(String[] args) {


        //new array-list style with just strings
        ArrayList<String> kids = new ArrayList<String>();

        //add items to the list
        kids.add("Natalie");
        kids.add("Brittany");
        kids.add("Zachary");

        //print out the list
        System.out.println(kids);

        //add a new kid
        kids.add("eric");

        //print out the list
        System.out.println(kids);

        //access just natalie with an ArrayList
        System.out.println(kids.get(0));

        //access just eric with an ArrayList
        System.out.println(kids.get(3) );

        //change the name of eric to bob
        kids.set(3, "Bob");

        kids.remove(0);

        //sort the collection alphabetically
        Collections.sort(kids);

        //loop over the ArrayList and print the kids names
        for (int i = 0; i < kids.size(); i++) {
            //print out a number and the kids name
            System.out.println((i + 1) + " : " + kids.get(i));
        }

        //boring old array that is not super flexible
        Book[] theBooks = {
                new Book(1, "12345", "Ready Player 1"),
                new Book(2, "23456", "Jurassic Park"),
                new Book(3, "789254", "Alice in Wonderland"),
                new Book(4, "633578", "To Kill a Mocking Bird"),
                new Book(5, "99955585", "Ready Player 2")
        };

        //books as an array list
        ArrayList<Book> theBooksAgain = new ArrayList<Book>();

        theBooksAgain.add(new Book(1, "12345", "Ready Player 1"));
        theBooksAgain.add(new Book(2, "23456", "Jurassic Park"));
        theBooksAgain.add(new Book(3, "789254", "Alice in Wonderland"));
        theBooksAgain.add(new Book(4, "633578", "To Kill a Mocking Bird"));
        theBooksAgain.add(new Book(5, "99955585", "Ready Player 2"));

        //loop over the ArrayList and print the book names
        for (int i = 0; i < theBooksAgain.size(); i++) {
            //print out a number and the nook name
            System.out.println((i + 1) + " : " + theBooksAgain.get(i).getTitle());
        }


    }

}
