package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(100, 0, true, 5);
        printer.addToner(10);
        System.out.println(printer.getTonerLevel());

        printer.print("Resume", 5);
        System.out.println("Pages printed = " + printer.getPagesPrinted());

    }
}
