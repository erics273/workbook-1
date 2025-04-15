package com.pluralsight;

public class ConditionalsDemo {

    public static void main(String[] args) {

        int age = 22;
        String name = "eric";

        //this is a conditional (if) statement
        if (age >= 18 && name.equals("eric")) {
            //this code runs if the condtion true
            System.out.println("Awesome, you are an adult and your name is eric");
        } else if (age < 18 && name.equals("bob")) {
            System.out.println("Whats up young bob");
        } else if (name.equals("bob") || name.equals("eric")) {
            System.out.println("The name was bob or it was eric");
        } else {
            //this is the code that runs if the condtion is false
            System.out.println("You got some growing up to do.");
        }

        if( (name.equals("bob") && age > 10) || name.equals("eric")){
            System.out.println("This is also a true condition");
        }

        String isOldEnoughToVote = (age >=18) ? "You are old enough to vote" : "Maybe next year";

        System.out.println(isOldEnoughToVote);

        String fullName = "Eric Schwartz";

        String[] namePieces = fullName.trim().split(" ");

        System.out.println(namePieces.length);

    }

}
