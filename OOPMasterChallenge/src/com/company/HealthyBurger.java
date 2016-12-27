package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/27/16.
 */
public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1 (String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2 (String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra1Name;
        this.healthyExtra2Price = healthyExtra1Price;
    }

    @Override
    public double burgerPrice() {
        double price = super.burgerPrice();

        if (this.healthyExtra1Name != null) {
            price += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra of " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            price += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra of " + this.healthyExtra2Price);
        }
        return price;
    }
}

