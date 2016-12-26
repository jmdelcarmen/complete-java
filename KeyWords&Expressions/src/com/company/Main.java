package com.company;

public class Main {

    public static void main(String[] args) {
        //a mile is equal to 1.609344
        double kilometers = (100 * 1.609344);
        System.out.println("You traveled " + kilometers + " kilometers.");

        int highscore = 50;

        if (highscore == 50) {
            System.out.println("You highscore is 50!");
        }

        //statement
        int mint = 100;

        for (int i = 0; i <= 10; i++) {
            System.out.println(mint);
            mint += 10;
        }



        int marr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            marr[i] = i;
            System.out.println(marr[i]);
        }


        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("You final score is : " + finalScore);
        }





    }
}
