package org.example.klassenundobjekte;

import java.util.Arrays;

public class Library {



    private Book[] books;
    public Book[] getBooks(){
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;

    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

}
