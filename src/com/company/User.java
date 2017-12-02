package com.company;

import java.util.ArrayList;
import java.util.List;

public class User {

    public String getName() {
        return name;
    }

    private String name;
    private double amountOfMoney;

    public List<BookstoreBook> getUsersBooks() {
        return usersBooks;
    }

    private List<BookstoreBook> usersBooks;

    public List<BookstoreBook> getReadBooks() {
        return readBooks;
    }

    private List<BookstoreBook> readBooks;

    public User(String name, double amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        usersBooks = new ArrayList<>();
        readBooks = new ArrayList<>();
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void buyBook(BookstoreBook book) {
        if (amountOfMoney >= book.getPrice()) {
            amountOfMoney = amountOfMoney - book.getPrice();
            usersBooks.add(book);
            System.out.println("Congratulations " + getName() + ", you bought " + book.getBook().getName() + "!");
        } else {
            System.out.println(getName() + ", you don't have eneugh money to buy " + book.getBook().getName() + "!");
        }
        System.out.println("You have " + getAmountOfMoney() + " money now" + "\n");
    }

    public void readBook(int bookNumber) {
        if (bookNumber < usersBooks.size()) {
            readBooks.add(usersBooks.get(bookNumber));
            System.out.println(getName() + " you read " + usersBooks.get(bookNumber).getBook().getName() + "\n");
        } else {
            System.out.println(getName() + ", you have to buy book at first, and then you would can to read it!" + "\n");
        }
    }
}