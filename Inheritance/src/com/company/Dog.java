package com.company;


//call the Animal constructor
public class Dog extends Animal {

    //unique characteristics of a dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //create a constructor for the Dog class that calls the Animal class
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //initializes the Dog class as a subclass to the Animal class
        super(1, 1, size, weight, name); //calls the Animal class.

        //initializing dog's unique fields inside the Dog constructor
        this.eyes = eyes;
        this.legs = legs;
        this. tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    } //Dog constructor

    private void chew () {
        System.out.println(this.getName() + " is chewing.");
    }

    public void walk () {
        System.out.println("Dog.walk() being called.");
        move(5);
    }

    public void run () {
        System.out.println("Dog.run() being called.");
        super.move(500, 'w'); //calling the super class Animal.move() method.
    }

    public String getCoat() {
        return coat;
    }

    public void move (int speed) {
        System.out.println("Dog.move() being called");
    }



    @Override
    public void eat(String food) {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat(food);
    }//dog eating


}
