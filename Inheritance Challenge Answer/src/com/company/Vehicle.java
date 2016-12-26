package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Vehicle {
    private String name;
    private int size;

    private int currentSpeed;
    private String currentDirection;

    private String currentVelocity;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;

        this.currentDirection = "North";
        this.currentSpeed = 0;
        this.currentVelocity = this.currentSpeed + " mph " + this.currentDirection;
    }

    public void steer(String direction) {
        this.currentDirection = direction;
        System.out.println("Steering to the " + direction);
    }

    public void move(int speed, String direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println(this.getName() + " is moving " + this.getCurrentVelocity());
    }

    public void stop () {
        this.currentSpeed = 0;
        System.out.println(this.getName() + " has stopped.");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public String getCurrentVelocity() {
        return this.currentSpeed + " mph " + this.currentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setCurrentVelocity(String currentVelocity) {
        this.currentVelocity = currentVelocity;
    }
}
