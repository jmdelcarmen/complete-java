package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Car extends Vehicle {
    private int doors;
    private int engineCap;

    public Car(String name, int doors, int engineCap) {
        super(name); //Vehicle fields
        this.doors = doors;
        this.engineCap = engineCap;
    }
}
