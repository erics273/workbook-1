package com.pluralsight.compareinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ItemApp {

    public static void main(String[] args) {

        //create our list
        List<Item> myItems = new ArrayList<>();
        //create and add items to the list
        myItems.add(new Item("Axe", 50));
        myItems.add(new Item("Taser", 12));
        myItems.add(new Item("BFG", 36));
        myItems.add(new Item("Bat", 10));
        myItems.add(new Item("Handgun", 100));

        //sorty the collection using
        Collections.sort(myItems);

        //loop over the list
        for (Item poop : myItems){
            System.out.println(poop.getName() + " - " + poop.getBonus());
        }


    }

}
