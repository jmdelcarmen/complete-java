package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));

        String name = "JESUS MARCO DEL CARMEN";
        String reversedName = "";
        for (int i = 0; i < name.length(); i++) {
            reversedName += name.toCharArray()[name.length() - (i + 1)];
        }

        System.out.println(reversedName);


        System.out.println("Enter the length of your array.");
        int arrLen = scanner.nextInt();
        int[] array = getIntegers(arrLen);

        for (int i = 0; i < arrLen; i++) {
            System.out.println(array[i]);
        }

        System.out.println("The average is " + getAverage(array));

    }

    //Dealing with user input
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values \r");
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;

        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
