package com.company;

public class Book {
    public String getName() {
        return name;
    }

    private String name;
    private int numberOfPages;
    private Author author;

    public int getYear() {
        return year;
    }

    private int year;


    public Book(String name, int numberOfPages, Author author) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;

    }


}
