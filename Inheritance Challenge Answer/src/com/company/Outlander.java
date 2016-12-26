package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */
public class Outlander extends Car {

    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", 4, 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentSpeed() + rate;
        if (newVelocity == 0) {
            this.stop();
            this.changeGear(1);
        }
        else {
            this.setCurrentSpeed(newVelocity);
            if (newVelocity > 60) {
                this.changeGear(6);
            }
            else {
                this.changeGear(Math.round(newVelocity / 10));
            }
        }

    }

}
