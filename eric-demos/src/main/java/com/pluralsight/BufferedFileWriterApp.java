package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedFileWriterApp {

    public static void main(String[] args) {

        try {

            //here is the file name
            String fileName = "inventory.csv";
            String outputFile = "doritos.txt";
            //create file input stream that kinda brings our file into our code
            //i put the file in the resources folder because technically thats where it should be
            FileReader theFile = new FileReader("src/main/resources/" + fileName);
            BufferedReader ourBufferedReader = new BufferedReader(theFile);

            // create a FileWriter
            FileWriter fileWriter = new FileWriter("src/main/resources/" + outputFile);
            // create a BufferedWriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            // create a FileWriter
            FileWriter fileWriter2 = new FileWriter("src/main/resources/daniel.txt");
            // create a BufferedWriter
            BufferedWriter bufWriter2 = new BufferedWriter(fileWriter2);

            //looping with the buffered reader
            String theLine;
            while((theLine = ourBufferedReader.readLine()) != null) {
                String[] productDetails = theLine.split("\\|");

                //generate a real product
                Product theProduct =  new Product(Integer.parseInt(productDetails[0]), productDetails[1], Double.parseDouble(productDetails[2]));

                System.out.printf("the product id is: %d, the product name is %s, the price is $%.2f\n", theProduct.getProductId(), theProduct.getName(), theProduct.getPrice());

                String lineForOutputFile = theProduct.getProductId() + ", " + theProduct.getName() + ", " + theProduct.getPrice() +"\n";
                bufWriter.write(lineForOutputFile);

                bufWriter2.write(lineForOutputFile);
            }

            //close the reader and writer
            bufWriter.close();
            bufWriter2.close();
            ourBufferedReader.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
