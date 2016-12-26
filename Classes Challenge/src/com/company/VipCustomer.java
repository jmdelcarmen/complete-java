package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/25/16.
 **/
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", "example@gmail.com", 1000.000);
        System.out.println("Constructor w/o params executed");
    }

    public VipCustomer(double creditLimit) {
        this("Default name", "example@gmail.com", creditLimit);
        System.out.println("Constructor with 1 param executed");
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
