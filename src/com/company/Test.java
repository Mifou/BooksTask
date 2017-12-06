package com.company;

public class Test {

    public static void main(String[] args) {
        Author StephenKing = new Author("Stephen_King");

        Book shining = new Book("Jasność", 453, StephenKing);
        Book petSementery = new Book("Smentarz zwieżąt", 537, StephenKing);
        Book It = new Book("It", 1021, StephenKing);

        StephenKing.writeBook(shining, 1999);
        StephenKing.writeBook(petSementery, 1989);
        StephenKing.writeBook(It, 1984);

        Bookstore Empik = new Bookstore();

        BookstoreBook shiningStore = new BookstoreBook(shining);
        BookstoreBook petSementeryStore = new BookstoreBook(petSementery);
        BookstoreBook ItStore = new BookstoreBook(It);

        Empik.addBookstoreBook(shiningStore, 10);
        Empik.addBookstoreBook(petSementeryStore, 20);
        Empik.addBookstoreBook(ItStore, 30);

        User Bolek = new User("Bolek", 72);
        Bolek.buyBook(shiningStore);
        Bolek.buyBook(petSementeryStore);
        Bolek.buyBook(ItStore);
        Bolek.readBook(0);
        Bolek.readBook(2);

        System.out.println("The Bolek's books are: ");
        for (int i = 0; i<Bolek.getUsersBooks().size();i++){
            System.out.print(Bolek.getUsersBooks().get(i).getBook().getName()+", ");
        }
        System.out.println();

        System.out.println("The books wchih Bolesław already read are: ");
        for (int i = 0; i<Bolek.getReadBooks().size();i++){
            System.out.print(Bolek.getReadBooks().get(i).getBook().getName()+", ");
        }



    }


}


