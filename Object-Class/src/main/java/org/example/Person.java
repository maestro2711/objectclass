package org.example;

public class Person {
    public String name;
    public int age;
    public String phone;
    public boolean aLive;

    //Contructor
    public Person(String name, int age, String phone, boolean alive){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.aLive=aLive;


    }

    public Person(String name, int age, String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.aLive=true;


    }

}
