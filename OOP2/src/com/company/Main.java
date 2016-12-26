package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PC thePc = new PC(theCase, theMonitor, theMotherboard);

        thePc.getTheCase().pressPowerButton();
        thePc.getTheMotherbaord().loadProgram("Super Mario");
        thePc.getTheMonitor().drawPixelAt(5,1,"brick red");

    }
}
