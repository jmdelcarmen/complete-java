package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Door {
    private int count;
    private String color;
    private int height;
    private int width;
    private String type;

    public Door(int count, String color, int height, int width, String type) {
        this.count = count;
        this.color = color;
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public void closeDoors() {
        System.out.println("The " + this.getCount() + " doors have been closed.");
    }

    public void openDoors() {
        System.out.println("The " + this.getCount() + " doors have been opened.");
    }

    public int getCount() {
        return count;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }
}
