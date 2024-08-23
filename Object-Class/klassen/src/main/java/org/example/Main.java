package org.example;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW","Fox","green",2010,200);
        Car car2 = new Car("VW","Fox","green",2010,200);
        Person person = new Person("Max",25,"mensch");
        car.startCar();
        car2.accelerate(200);
        person.hello();




    }
}