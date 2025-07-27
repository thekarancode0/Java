package com.mycompany.model;

public class carClass {

    String make;
    String model;
    int year;

    public carClass(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Engine is starting...");
    }

    public void drive() {
        System.out.println("Driving...");
    }

    public void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing  year: " + year);
    }
}
