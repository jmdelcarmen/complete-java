package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "Flat");
        double price = hamburger.burgerPrice();
        System.out.println(price);

        hamburger.addHamburgerAddition1("Lettuce", 0.50);
        hamburger.addHamburgerAddition2("Tomatoes", 0.25);
        hamburger.addHamburgerAddition3("Carrots", 0.1);
        hamburger.addHamburgerAddition4("Cookies", 0.40);

        price = hamburger.burgerPrice();

        System.out.println("Total burger price is $" + String.format("%.2f", price));

        System.out.println("\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Spinach", 10.00);
        healthyBurger.addHealthyAddition2("Olives", 5.00);
        System.out.println("Total price: $" + healthyBurger.burgerPrice());

        System.out.println("\n");

        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Total burger price is $" + String.format("%.2f", db.burgerPrice()));
    }

}
