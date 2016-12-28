package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        System.out.println("How many elements would you like your array to have?");
        int [] array = new int[scanner.nextInt()];

        System.out.println("Enter the " + array.length + " values you would like to store in your array.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Your array = " + Arrays.toString(array));
        System.out.println("Your sorted array = " + Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        int[] sorted = Arrays.copyOf(array, array.length);



        //bubble sort
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] > sorted[ i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[ i + 1 ];
                    sorted[ i + 1 ] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }//sortArray

}//main
