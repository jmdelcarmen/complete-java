package com.company;

public class Main {

    public static void main(String[] args) {
        //creating an object
        Car honda = new Car();

        honda.setModel("City");
        System.out.println(honda.getModel());
        honda.setModel("Civic");
        System.out.println(honda.getModel());
    }
}
