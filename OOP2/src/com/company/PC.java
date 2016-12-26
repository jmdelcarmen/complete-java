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

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherbaord() {
        return theMotherbaord;
    }
}
