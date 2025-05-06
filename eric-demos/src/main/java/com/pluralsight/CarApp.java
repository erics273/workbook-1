package com.pluralsight;

public class CarApp {

    public static void main(String[] args) {


        //create the car
       Car car1 = new Car("Ford", "Mustang");
       //show the cars speed after it was created
        System.out.println(car1.getSpeed());
        //accelerate 2x
        car1.accelerate(10);
        car1.accelerate(25);
        //whats the speed now
        System.out.println(car1.getSpeed());
        //slow down
        car1.brake(10);
        //whats the speed now
        System.out.println(car1.getSpeed());

    }


}
