package com.company;


public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    public void move(int distance, char direction) {
        String dir;

        switch (direction) {
            case 'n':
                dir = "North";
                break;
            case 's':
                dir = "South";
                break;
            case 'e':
                dir = "East";
                break;
            case 'w':
                dir = "West";
                break;
            default:
                dir = "Forward";
                break;
        }
        System.out.println("Animal.move() being called.");
        System.out.println(getName() + " is moving " + distance + " feet " + dir);
    }


    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
