package com.pluralsight;

import java.util.regex.Pattern;

public class StringComparisons {

    public static void main(String[] args) {

        // The compiler creates a string literal "ABC" and // the s1 variable references it
        String s1 = "ABC";

        // s2 references the **same string literal**
        String s2 = "ABC";

        // But s3 does NOT reference that literal because its
        // value was created by performing concatenation
        String s3 = new String("ABC");

        System.out.println("S1="+ s1);
        System.out.println("S3="+ s3);

        //these are bad, do not use ==
        if (s1 == s2) {
            System.out.println("s1 and s2 are the same, they are equal");
        }

        if (s1 == s3) {
            System.out.println("s1 and 3 are the same, they are equal");
        }


        //use .equals to be safe when comparing strings
        if (s1.equals(s3)) {
            System.out.println("s1 and 3 are the same, they are equal as long as we use .equals");
        }

        //what is the length of s1
        System.out.println("s1's lenght is " + s1.length());

        //trimming and length
        String username = "       danaw      ";
        //what is the length of username before we trim it
        System.out.println("usernames's ("+username+") length is " + username.length());
        //remove the leading and trailing spaces with trim
        username = username.trim();
        //what is the length after we trim the string
        System.out.println("usernames's ("+username+") length is " + username.length());

        //same output but with printf
        System.out.printf("(printf example: usernames's (%s) length is %d%n", username, username.length());

        //convert the username to uppercase
        System.out.printf("the username converted to uppercase is %s%n", username.toUpperCase());

        //does username start with da
        if(username.startsWith("da")){
            System.out.println("you have a superior username");
        }else{
            System.out.println("you hava a crappy username");
        }


        //substring and indexof example

        //a product
        String productCode = "ACME-12213";
        //get the position (index) of the - (4)
        int dashPosition = productCode.indexOf("-");

        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);

        System.out.println("The whole product code is " + productCode);
        System.out.println("The vendor is " + vendor);
        System.out.println("The product number is " + productNum);


        System.out.println("------using split-----------------");

        //a product
        String productCode2 = "ACME-12213";

        //split our string into an array of strings
        String[] productCodeParts = productCode2.split("-");

        System.out.println(productCodeParts.length);

        String vendor2 = productCodeParts[0];
        String productNum2 = productCodeParts[1];

        System.out.println("The whole product code is " + productCode2);
        System.out.println("The vendor is " + vendor2);
        System.out.println("The product number is " + productNum2);

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        System.out.println(cities[1]);


    }

}
