package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Car extends Vehicle {

    private int wheels;
    private int seats;
    private int windows;
    private int gear;
    private int speed;

    public Car(int size, int weight, int doors, int maxload, int wheels, int seats, int windows, int gear, int speed) {
        super(size, weight, "Car", doors, maxload);
        this.wheels = wheels;
        this.seats = seats;
        this.windows = windows;
        this.gear = gear;
        this.speed = speed;
    }

    public void shift(int gear) {
        this.setGear(gear);
    }

    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear has been shifted to " + this.gear);
    }

    public void move () {
        super.move(this.speed);
    }

    public void speedUp() {
        if (this.speed + 10 <= 120) {
            this.speed += 10;
            super.move(this.speed);
        }
        else {
            System.out.println("Your current speed is " + this.speed + " you can't move any faster.");
        }
    }

    public void slowDown() {
        if (this.speed - 10 >= 0) {
            this.speed -= 10;
            super.move(this.speed);
        }
        else {
            System.out.println("Your current speed is " + this.speed + " you can't move any slower.");
        }
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }
}
