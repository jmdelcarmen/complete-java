package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double amount = 10000;
        double [] interests = {2, 3, 4, 5, 6, 7, 8};

        for (int i = 8; i >= 2; i--) {
            System.out.println("Interest " +  String.format("%.2f" ,clacInterest(amount, i)));
        }
        System.out.println(isPrime(11));
        int primeCount = 0;

        for (int i = 10; i <=50; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println(i + " is prime");
            }
        }
        System.out.println(primeCount);

    }//main

    public static double clacInterest(double amount, double interest) {
        return (amount * (interest/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
