package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;

    public Car(String name, String brand, String model, String color, int yearOfManufacture){
        this.brand = brand;
        this.model = model;
        this.color= color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void startCar(){
        System.out.println("the car is running now");
    }
}
