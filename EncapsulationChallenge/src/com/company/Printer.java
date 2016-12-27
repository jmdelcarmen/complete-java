package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    private int batchMax;

    public Printer(int tonerLevel, int  pagesPrinted, boolean duplex, int batchMax) {
        if (tonerLevel <= 100 && tonerLevel >= 0) {
            this.tonerLevel = tonerLevel;
        }
        else {
            System.out.println("Toner level max is 100");
        }

        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
        this.batchMax = batchMax;
    }

    public void print(String file, int pages) {
        if (pages <= this.batchMax) {
            this.pagesPrinted += pages;
            if (this.duplex) {
                System.out.println("Printing " + pages + " copy of " + file + " on both sides.");
            }
            else {
                System.out.println("Printing " + pages + " copy of " + file);
            }
        }
        else {
            System.out.println("The max batch count is " + this.batchMax + ", you should try splitting your batch.");
        }
    }

    public void addToner(int tonerLevel) {
        if (this.tonerLevel + tonerLevel <= 100 && tonerLevel > 0) {
            this.tonerLevel += tonerLevel;
        }
        else {
            System.out.println("Your toner level is at " + this.tonerLevel + " it can't be filled past 100");
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getBatchMax() {
        return batchMax;
    }

}
