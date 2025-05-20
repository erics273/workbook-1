package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExampleApp {

    public static void main(String[] args) {

        //index is number based
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("eric");
        myList.add("bob");

        //print out the entire list
        System.out.println(myList);

        //get the first item off the list
        System.out.println(myList.get(0));

        //update eric to steve
        myList.set(0, "steve");

        //get the first item off the list
        System.out.println(myList.get(0));

        //the index is string based
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("eric", 43);
        myMap.put("jack", 75);

        //what the hell is this
        //either get the item out of the map if it exists. If not, it will create with the default value
        int value = myMap.getOrDefault("jack", 50);

        System.out.println(value);

        //print out the entire map
        System.out.println(myMap);

        //just get 43 out of the map
        System.out.println(myMap.get("eric"));

        //update erics age
        myMap.put("eric", 44);

        //show the updated value for erics age
        //just get 44 out of the map
        System.out.println(myMap.get("eric"));

        //just get 43 out of the map
        System.out.println(myMap.get("jack"));

        HashMap<String, Person> myPeople = new HashMap<String, Person>();

        Person eric = new Person("eric", "Schwartz", "123", 44);

        myPeople.put(eric.getFirstName(), eric);

        System.out.println(myPeople.get("eric").getFullName());

        if(myPeople.containsKey("eric")){
            System.out.print(true);
        }else {
            System.out.print(false);
        }

    }

}
