package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedFileReaderApp {

    public static void main(String[] args) {

        try {

            //here is the file name
            String fileName = "inventory.csv";
            //create file input stream that kinda brings our file into our code
            //i put the file in the resources folder because technically thats where it should be
            FileReader theFile = new FileReader("src/main/resources/" + fileName);
            BufferedReader ourBufferedReader = new BufferedReader(theFile);

            //looping with the buffered reader
            String theLine;
            while((theLine = ourBufferedReader.readLine()) != null) {
                String[] productDetails = theLine.split("\\|");

                //generate a real product
                Product theProduct =  new Product(Integer.parseInt(productDetails[0]), productDetails[1], Double.parseDouble(productDetails[2]));

                System.out.printf("the product id is: %d, the product name is %s, the price is $%.2f\n", theProduct.getProductId(), theProduct.getName(), theProduct.getPrice());

            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
