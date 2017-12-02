package com.company;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<Book> bibligraphy;

    public Author(String name) {
        this.name = name;
        bibligraphy = new ArrayList<>();
    }


    public void writeBook(Book book, int year) {
        bibligraphy.add(book);
        year = book.getYear();
    }


}
