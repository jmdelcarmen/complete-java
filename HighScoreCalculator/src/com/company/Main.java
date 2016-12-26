package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] players = {"Marco", "Jack", "Gulmaster", "Josh"};
        int [] scores = {1000, 500, 7000, 220};
        System.out.println("Players: " + Arrays.toString(players));
        System.out.println("Scores: " + Arrays.toString(scores));

        for (int i = 0; i < players.length; i++) {
            if (scores[i] >= 1000) {
                displayPosition(players[i], 1);
            }
            else if (scores[i] >= 500) {
                displayPosition(players[i], 2);
            }
            else if (scores[i] >= 250) {
                displayPosition(players[i], 3);
            }
            else {
                displayPosition(players[i], 4);
            }
        }

    } //main




    public static void displayPosition(String name, int position ) {
        System.out.println(name + " is in position " + position);

    } //displayPosition

}
