package com.company;

public class Main {

    public static void main(String[] args) {
        //bank account class
        BankAccount account = new BankAccount();
        System.out.println(account.getEmail());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getPhoneNumber());



        //VIP customer class
        VipCustomer marco = new VipCustomer("Marco", "ggkana@yahoo.com",700000.00);
        System.out.println("Your credit limit is " + marco.getCreditLimit());
        System.out.println("Your email address is " + marco.getEmail());
        for (int i = 0; i < marco.getName().length(); i++) {
            System.out.println("Your name is " + marco.getName().toUpperCase().charAt(i));
        }

    }
}
