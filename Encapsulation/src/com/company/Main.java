package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Player player = new Player();
//
//        player.name = "Marco";
//        player.health = 100;
//        player.weapon = "Saber";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//        System.out.println("The remaining health is " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("The remaining health is " + player.healthRemaining());
//
//        player.loseHealth(damage);
//        System.out.println("The remaining health is " + player.healthRemaining());
//
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Saber");

        System.out.println("Initial health is " + player.getHealth());

    }
}
