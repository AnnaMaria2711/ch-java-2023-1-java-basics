package org.example.klassenundobjekte;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Auto myCar = new Auto("Ford", "F-150", "schwarz", "2023");
        myCar.startCar();
        myCar.setVelocity();






        Book aBook = new Book();
        aBook.setTitle("dictionary");
        aBook.setAuthor("Anni");
        aBook.setIsbn(76483657);

        System.out.println(aBook.getTitle());
        System.out.println(aBook.getAuthor());
        System.out.println(aBook.getIsbn());

        System.out.println(aBook);

        Library library1 = new Library();
        Book[] books ={
                aBook, new Book(), new Book()
        };
        library1.setBooks(books);

        System.out.println(library1);



    }
}
