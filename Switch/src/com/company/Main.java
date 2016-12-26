package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
    int val = 100;

    switch (val) {
        case 1:
            System.out.println("I am one");
            break;
        case 2:
            System.out.println("I am two");
            break;
        case 3:
            System.out.println("I am three");
            break;
        case 4:
            System.out.println("I am four");
            break;
        case 5:
            System.out.println("I am five");
            break;
        default:
            System.out.println("Too high bro.");
            break;
    }

    char month = 'J';

    switch (month){
        case 'J':
            System.out.println("The month is January");
            break;
        case 'F':
            System.out.println("The month is February");
            break;
        case 'M':
            System.out.println("The month is March");
            break;
        case 'A':
            System.out.println("The month is April");
            break;
        case 'm':
            System.out.println("The month is May");
            break;
        default:
            System.out.println("Month not found.");
    }

    String name = "marco";

        System.out.println(name.toUpperCase());


    }//main
}
