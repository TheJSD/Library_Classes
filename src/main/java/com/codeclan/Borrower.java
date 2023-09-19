package com.codeclan;

import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<>();
    }

    public int NumberOfBorrowedBooks() {
        return borrowedBooks.size();
    }
    public void borrowBook(Library library, Book book){
        if (library.removeBook(book)){
            this.borrowedBooks.add(book);
        }
    }
}
