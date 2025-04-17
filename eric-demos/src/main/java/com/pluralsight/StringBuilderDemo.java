package com.pluralsight;

import java.util.Scanner;

public class StringBuilderDemo {

    public static void main(String[] args) {
        // create a StringBuillder object
        StringBuilder skills = new StringBuilder();

        // append strings to the StringBuilder object skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");
//
//        // retrieve the underlying characters from // the StringBuilder
        System.out.println(skills);


        //using insert to add
        StringBuilder sb = new StringBuilder("HelloWorld");
        sb.insert(5, "-eric-");
        System.out.println(sb);

        //paindrome
        StringBuilder orginalWord = new StringBuilder("pizza");
        StringBuilder reversedWord = new StringBuilder(orginalWord).reverse();

        System.out.println();

        if(orginalWord.toString().equals(reversedWord.toString())){
            System.out.println("you found a palindrome");
        }else{
            System.out.println("THe word was not a palindrome");
        }


        //examole of gettting input from the scanner and builder
        Scanner theScanner = new Scanner(System.in);

        System.out.println("what is your first name?");
        String firstName =  theScanner.nextLine();

        System.out.println("what is your last name?");
        String lastName =  theScanner.nextLine();

        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);
        fullName.append(" ");
        fullName.append(lastName);

        System.out.println(fullName.toString());






    }

}
