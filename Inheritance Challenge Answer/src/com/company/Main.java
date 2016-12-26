package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Porche", 300, 4, 2, 6, true);

        car.changeVelocity(5, "west");
        car.stop();
        System.out.println(car.getCurrentVelocity());

        System.out.println("*********OUTLANDER HERE*********");

        Outlander outlander = new Outlander(4);

        outlander.accelerate(40);
        System.out.println(outlander.getCurrentVelocity());
        outlander.accelerate(10);
        System.out.println(outlander.getCurrentVelocity());
        outlander.steer("West");
        System.out.println(outlander.getCurrentVelocity());
        outlander.accelerate(-20);
        System.out.println(outlander.getCurrentVelocity());
    }
}
