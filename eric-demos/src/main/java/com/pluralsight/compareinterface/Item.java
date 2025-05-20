package com.pluralsight.compareinterface;

public class Item implements Comparable<Item>{
    private String name;
    private int bonus;

    public Item(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public int compareTo(Item otherItem) {
        return this.getName().compareToIgnoreCase(otherItem.getName());
    }
}