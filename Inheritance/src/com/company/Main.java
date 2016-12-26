package com.company;

public class Main {

    public static void main(String[] args) {
        //initialize animal
        Animal animal = new Animal(1,1, 1, 1, "Marco");

        //initialize dog
        Dog dog = new Dog(1, 150, "Roger", 2, 4, 1,32, "Black & Fluffy");

        System.out.println("My dog's name is " + dog.getName());
        System.out.println("He has " + dog.getBrain() + " brain.");
        System.out.println("And he weighs " + dog.getWeight() + "lbs");

        //using the eat method inherited from the Animal Class
        dog.eat("Steak");
        dog.move(1000, 'w');

        System.out.println(dog.getName() + "'s coat is " + dog.getCoat());

        dog.walk();
        dog.run();
        dog.move(500, 'n');
        dog.move(5);


        System.out.println("***********FISH***********");

        Fish fish = new Fish(5, 10, "Dory", 2, 2, 2);

        fish.move(5);


    }
}