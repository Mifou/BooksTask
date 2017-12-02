package com.company;

public class BookstoreBook {
    private Book book;
    private double price;

    public double getPrice() {
        return price;
    }

    public Book getBook() {
        return book;
    }

    public BookstoreBook (double price, Book book){
        this.price = price;
        this.book = book;
    }
}


