package com.codeclan;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }
    public int countBooks(){
        return collection.size();
    }
    public void addBook(Book book){
        if (!this.checkIfFull()) {
            this.collection.add(book);
        }
    }
    public boolean checkIfFull(){
        return this.countBooks() >= this.capacity;
    }
    public boolean removeBook(Book book){
        return this.collection.remove(book);
    }
}
