package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/26/16.
 */


public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <=100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out.");
            //reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return this.health;
    }

}
