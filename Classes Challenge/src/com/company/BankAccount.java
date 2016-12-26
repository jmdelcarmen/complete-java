package com.company;

/**
 * Created by jesusmarcodelcarmen on 12/25/16.
 **/
public class BankAccount {

    private String customerName;
    private int phoneNumber;
    private double balance;
    private String email;
    private int acctNumber;


    //*********************Constructor WITHOUT params*********************

    public BankAccount() {
        this("Marco", 5555555, 10000.00, "ggkana@yaho.com", 95640394);
        //default values
        System.out.println("Constructor without params called. Default values have been set.");
    }

    //*********************Constructor WITH params*********************
    public BankAccount(String customerName, int phoneNumber, double balance, String email, int acctNumber) {
        System.out.println("Constructor with params called.");
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.email = email;
        this.acctNumber = acctNumber;
    }


    //*********************customer name*********************
    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }


    //*********************email*********************
    public void setEmail (String email) {
        this.email = email;
    }

    public String getEmail () {
        return this.email;
    }

    //*********************account Number*********************
    public void setAccountNumber (int accountNumber) {
        this.acctNumber = accountNumber;
    }

    public int getAccountNumber () {
        return this.acctNumber;
    }

    //*********************balance*********************
    public void setBalance (double balance) {
        this.balance = balance;
    }

    public double getBalance () {
        return this.balance;
    }

    //*********************phone number*********************
    public String setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return "You phone number has been set to " + this.phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }


    //deposit
    public String deposit(double amount) {
        this.balance += amount;
        System.out.println("$" + amount + " has been added to your account.");
        return "You remaining balance is " + this.balance;
    }

    //withdraw
    public double withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("$" + amount + " has been deducted from your account.");
            return amount;
        }
        else {
            System.out.println("You have insufficient funds.");
            return this.balance;
        }

    }





}
