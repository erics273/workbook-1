package com.pluralsight;

import java.util.regex.Pattern;

public class StingParsingAndDataTypeConversion {

    public static void main(String[] args) {

        // string contains "id|description|quantity|price"
        String input2 = "111|Hot Chocolate (12-count)|21|4.99";

        //breaks the above string into meaningful pieces (Array/List)
        String[] stringPiecesArray = input2.split("\\|");

        //pring out a single item on the list
        System.out.println(stringPiecesArray[0]);

        //pring out a how many items on the list
        System.out.println(stringPiecesArray.length);

        //get the last item on a list
        System.out.println(stringPiecesArray[ stringPiecesArray.length - 1 ]);

        //this line converts a string representation of a int to an actual int
        int id =  Integer.parseInt( stringPiecesArray[0] );

        //print out the number (int)
        System.out.println(id);

          String name = stringPiecesArray[1];
         int quantity = Integer.parseInt(stringPiecesArray[2]);
         double price = Double.parseDouble(stringPiecesArray[3]);

        System.out.println(id + " " + quantity + " " + price + " " + name);

    }

}
