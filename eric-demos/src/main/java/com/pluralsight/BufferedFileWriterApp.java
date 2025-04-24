package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedFileWriterApp {

    public static void main(String[] args) {

        try {

            // create a FileWriter
            FileWriter fileWriter = new FileWriter("src/main/resources/eric.txt");
            // create a BufferedWriter
            BufferedWriter theMagicPen = new BufferedWriter(fileWriter);

            theMagicPen.write("hello from eric land");



        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
