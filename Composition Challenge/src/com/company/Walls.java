package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Walls {
    private int sides;
    private String color;
    private boolean hasArt;

    public Walls(int sides, String color, boolean hasArt) {
        this.sides = sides;
        this.color = color;
        this.hasArt = hasArt;
    }

    public int getSides() {
        return sides;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasArt() {
        return hasArt;
    }
}
