package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFun {

    public static void main(String[] args) {

        //get a dat string
        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);

        //print the entire birthday
        System.out.println(birthDay);

        //print just the day of the month
        System.out.println(birthDay.getDayOfMonth());

        //below code allows us to control the format the user give us the date in

        //creatre a formatter so we control the way the date needs to look vs the iso standard
        DateTimeFormatter theDateFormatYouAreLookingFor = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //the date we are working with
        String userInput2 = "10/17/2025";

        //parse the date with the formatter passed as the 2nd argument
        LocalDate birthDay2 = LocalDate.parse(userInput2, theDateFormatYouAreLookingFor);

        //a specific formatter just for the output
        DateTimeFormatter theFormatForDisplay = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        //print the entire birthday in the new format my passing the formatter to the date
        System.out.println(birthDay2.format(theFormatForDisplay));

        //print just the day of the month


        //get todays date
        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek());


    }


}
