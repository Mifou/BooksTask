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

    public BookstoreBook (Book book){
        this.book = book;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


