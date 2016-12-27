package com.company;


class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {//============CAR CLASS
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car -> Start engine()";
    }

    public String accelerate() {
        return "Car -> Accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}


class Tesla extends Car {//============CAR CLASS

    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Tesla -> Start engine()";
    }

    @Override
    public String accelerate() {
        return "Tesla -> Accelerate()";
    }

    @Override
    public String brake() {
        return "Tesla -> brake()";
    }
}





public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "Basic Car");
        System.out.println(car.startEngine());
        System.out.println(car.getName() + "\n");


        Tesla tesla = new Tesla(0, "Model 3");
        System.out.println(tesla.startEngine());
        System.out.println(tesla.getName() + "\n");

        Honda honda = new Honda(6, "Civic");
        System.out.println(honda.startEngine());
        System.out.println(honda.getName() + "\n");

        System.out.println(car.getClass().getSimpleName() + " class");
        System.out.println(tesla.getClass().getSimpleName() + " class");
        System.out.println(honda.getClass().getSimpleName() + " class");

    }

}
