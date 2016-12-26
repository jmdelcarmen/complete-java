package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calculation(8,0) + " cm");
    } //main



    public static double calculation (double feet, double inches) {
        double cm = 0;

        if (feet > 0 && inches >=0 && inches < 12) {
            cm = feetAndInchesToCentimeters(feet, inches);
            System.out.println("Feet and Inches");
        }
        else {
            cm = feetAndInchesToCentimeters(inches);
            System.out.println("Only Inches");
        }
        return cm;
    }//calculation


    public static double feetAndInchesToCentimeters (double feet, double inches) {
        return (feet * 12 + inches) * 2.54;
    } //feetAndInchesToCentimeters

    public static double feetAndInchesToCentimeters (double inches) {
        return inches * 2.54;
    }

}
