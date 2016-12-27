package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherbaord;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherbaord) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherbaord = theMotherbaord;
    }

    public void powerUp() {
        this.getTheCase().pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        for (int i = 0; i < 10; i++) {
            this.getTheMonitor().drawPixelAt(i,i * 3, "white");
        }
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getTheMonitor() {
        return theMonitor;
    }

    private Motherboard getTheMotherbaord() {
        return theMotherbaord;
    }
}
