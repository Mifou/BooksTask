package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<BookstoreBook> bookstoreBooks;

    public Bookstore(){
        this.bookstoreBooks = new ArrayList<>();
    }
    public void addbookstorebook(BookstoreBook book){
        bookstoreBooks.add(book);
    }




}

