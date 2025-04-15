package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean appRunning = true;

        while(appRunning == true){

            int sammySize = sammySizeSelection();

            double total = 0;
            if(sammySize == 1){
                total += 5.45;
            } else if (sammySize == 2) {
                total += 8.95;
            }else {
                System.out.println("\nInvalid Selection, try again!\n");
                continue;
            }

            int discount = 0;
            try{

                int customerAge = ageSelection();
                if(customerAge <= 17){
                    discount = 10;
                } else if (customerAge >= 65) {
                    discount = 20;
                }

            }catch (Exception e){
                System.out.println("\nInvalid age but that's okay, we'll start over\n");
                //clear the buffer before we start over
                theScanner.nextLine();
                continue;
            }


            total = total - (total * discount /100);

            displayTotal(sammySize, total, discount);

            String orderAnother = orderAnotherSammy();

            if(!orderAnother.equalsIgnoreCase("y")){
                appRunning = false;
            }


        }


    }

    public static int sammySizeSelection() {

        //Ask the user what size sammy
        System.out.println("What size Sammy would you like?");
        System.out.println("\t1: Regular: $5.45");
        System.out.println("\t2: Large: $8.95");
        System.out.print("What size would you like? ");

        int choice = theScanner.nextInt();

        return choice;

    }

    public static int ageSelection() {

        //Ask the user what size sammy
        System.out.println("How old are you?");
        System.out.println("\t <= 17 gets 10% off");
        System.out.println("\t >=65 gets 20% off");
        System.out.print("Enter your age: ");

        int age = theScanner.nextInt();

        return age;

    }

    public static void displayTotal(int sammySize, double total, int discount) {

        String size = "";
        if(sammySize == 1){
            size = "Regular";
        } else if (sammySize == 2) {
            size = "Large";
        }

        //Ask the user what size sammy
        System.out.printf("The total for your %s sandwich is: $%.2f\n", size, total);

        if(discount > 0){
            System.out.println("This includes your " + discount + "% discount");
        }

    }

    public static String orderAnotherSammy() {

        //Ask the user what size sammy
        System.out.print("Would you like to order another Sammy? (Y/N) ");
        theScanner.nextLine();
        return theScanner.nextLine();

    }

}
