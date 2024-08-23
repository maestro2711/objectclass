package org.example;


public class Main {
    public static void main(String[] args) {
        Person pommes = new Person("Müller",35, "124554555",true);
        Person rotWeiss = new Person("Müller",35, "124554555");
        Person[] phonebook = {pommes,rotWeiss};

        addPerson(pommes);
        addPerson(rotWeiss);

    }

    public static void addPerson(Person person){
        System.out.println(person.name);
        System.out.println(person.age);

    }
}