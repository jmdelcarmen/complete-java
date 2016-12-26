package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Fish extends Animal{

    private int gills;
    private int fins;
    private int eyes;

    public Fish(int size, int weight, String name, int gills, int fins, int eyes) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }//fish constructor

    private void rest() {

    }

    private void moveMuscles () {
        System.out.println("Muscles are moving.");
    }

    private void moveBackFin() {
        System.out.println("Back fin is moving.");
    }

    private void swim(int speed) {
        this.moveMuscles();
        this.moveBackFin();
        System.out.println(getName() + " is swimming at " + speed + "mph.");
        super.move(500, 'n');
    }

    public void move(int speed) {
        System.out.println("Fish.move () being called.");
        this.swim(speed);
    }


}
