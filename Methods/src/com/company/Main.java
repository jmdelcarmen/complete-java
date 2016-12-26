package com.company;

public class Main {

    //main method called when file is executed.
    public static void main(String[] args) {
	// write your code here
        int sum = add(9, 10);
        System.out.println(printName("marco") + " added " + sum);
    }

    //return type string
    //param type string
    public static String printName(String name) {
        return name;
    }
    //return type is int
    // parameters are of type int
    public static int add(int x, int y) {
        return x + y;
    }


}
