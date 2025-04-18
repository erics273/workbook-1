package com.pluralsight;

public class PersonApp {

    public static void main(String[] args) {
        //let's use our person class to create a person
        Person eric = new Person("Eric", "Schwartz", "111-11-1111", 43);

        //make the person say hello
        eric.sayHello();

        //get the firstName
        System.out.println(eric.getFirstName());

        //get the lastName
        System.out.println(eric.getLastName());

        Person bob = new Person("Bob", "Smith", "111-22-4444", 100);
        bob.sayHello();
        System.out.println(bob.getFirstName());

        System.out.println(bob.getHealth());
        bob.goToWork();
        System.out.println(bob.getHealth());
        bob.goToSleep();
        System.out.println(bob.getHealth());

    }

}
