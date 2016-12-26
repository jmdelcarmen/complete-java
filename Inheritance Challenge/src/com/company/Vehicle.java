package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Vehicle {

    private int size;
    private int weight;
    private String type;
    private int doors;
    private int maxload;


    public Vehicle() {
        this(5, 1000, "Car", 4, 5000);
        System.out.println("Default Vehicle Made.");
    }

    public Vehicle(int size, int weight, String type, int doors, int maxload) {
        this.size = size;
        this.weight = weight;
        this.type = type;
        this.doors = doors;
        this.maxload = maxload;
        System.out.println("Custom vehicle made.");
    }


    public void move(int speed) {
        System.out.println(getType() + " moving at " + speed  + " mph.");
    }


    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getMaxload() {
        return maxload;
    }
}
