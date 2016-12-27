package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;


    public Bed(String style, int pillows, int height, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
    }


    public void make() {
        System.out.println("Your bed has been made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
}
