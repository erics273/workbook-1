package com.pluralsight;

public class Person {

    //these are things that describe a person
    private String firstName;
    private String lastName;
    private String ssn;
    private int age;
    private int health;

    public Person(String firstName, String lastName, String ssn, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.age = age;
        this.health = 100;
    }

    public void goToWork(){
        this.health -= 5;
    }

    public void goToSleep(){
        this.health += 10;
    }


    //A person can sayHello so we give them a method to do that
    public void sayHello(){

        System.out.println("hi! i'm " + this.getFirstName());

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
