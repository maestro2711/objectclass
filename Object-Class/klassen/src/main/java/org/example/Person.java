package org.example;

public class Person {
    String name;
    int age;
    String gender;

    //constructor

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void hello(){
        System.out.println("Hallo, mein Name ist  " +name+ " und ich bin " +age+ " alt.  Ich bin männlich  " +gender+  ".");
    }
}
