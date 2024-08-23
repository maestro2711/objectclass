package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car( String brand, String model, String color, int yearOfManufacture,int speed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    public void startCar(){
        System.out.println("the car is running now");
    }

    public void accelerate(int speed){
        this.speed = speed;
        System.out.println("The car is accelerating with speed: " +speed);
    }
}
