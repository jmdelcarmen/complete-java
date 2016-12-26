package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        double prevresult = (double) result / 5;

        System.out.println(result / 2.1);
        System.out.println(prevresult);

        //modulus
        int mod = 5%2;
        System.out.println("Modulus : " + mod);

        boolean isHuman = true;

        if(isHuman) {
            System.out.println("You are a Human");
        }

        int topscore = 120;

        if (topscore <= 100) {
            System.out.println("You got the topscore.");
        } else {
            System.out.println("You suck!");
        }

        String indexes = "";
        //for loop
        for (int i = 0; i < 10; i++) {
            indexes += " Index: " + i;
            System.out.println(indexes);
        }


        double x = 20;
        double y = 80;

        double sum = (x + y) * 25;
        double remainder = sum % 40;

        if (remainder <= 20) {
            System.out.println("The remainder is at most 20");
        } else {
            System.out.println("Remainder is greater than 20");
        }










    }
}
