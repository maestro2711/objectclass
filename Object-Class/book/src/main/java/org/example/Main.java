package org.example;

public class Main {
    public static void main(String[] args) {
      Book[] books = new Book[]{new Book("Larynx", "maxim", "21459875m")};
        Book[] books2 = new Book[]{new Book("Larss", "OOP", "21498875m")};

        Library library = new Library(books);
        System.out.println(library);

    }






}