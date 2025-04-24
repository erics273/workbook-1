package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFunTwo {

    public static void main(String[] args) {


        //get todays date using LocalDate.now()
        LocalDate today = LocalDate.now();
        //print out todays date
        System.out.println("Today is: " + today);

        //get the current time using LocalTime.now()
        LocalTime currentTime = LocalTime.now();
        //print out the current time
        System.out.println("It is currently is: " + currentTime);

        //get the current date and time together
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        //print out the current date and time together
        System.out.println("It is currently is: " + currentDateAndTime);

        //print out just the day of the month
        System.out.println( "current day of month:" + currentDateAndTime.getDayOfMonth() );
        //print out just the day of the week
        System.out.println("current day of the week:" + currentDateAndTime.getDayOfWeek() );
        //print the current month
        System.out.println("current month:" + currentDateAndTime.getMonth()  );
        System.out.println("current second:" + currentDateAndTime.getSecond()  );

        //create a formatter to format the date how I want to see it

        // Format 1: 09/05/2021
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("Format 1: " + currentDateAndTime.format(formatter1));

        // Format 2: 2021-09-05
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2: " + currentDateAndTime.format(formatter2));

        // Format 3: Sunday, Sep 5, 2021  10:02
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy  HH:mm");
        System.out.println("Format 3: " + currentDateAndTime.format(formatter3));

        //we have a date as a string
        String someDate = "09/30/2025";
        //create date from string using parse method
        LocalDate dateFromString = LocalDate.parse(someDate, formatter1);
        //display the current month from that date
        System.out.println("current month from string generated date:" + dateFromString.getMonth()  );



    }


}
