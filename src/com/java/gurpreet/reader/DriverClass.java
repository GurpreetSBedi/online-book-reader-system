package com.java.gurpreet.reader;

public class DriverClass {
    public static void main(String[] args)
    {

        OnlineReaderSystem onlineReaderSystem = new OnlineReaderSystem();

        Book dsBook = new Book(1, "It contains Data Structures", "Datastruture");
        Book algoBook = new Book(2, "It contains Algorithms", "Algorithm");

        onlineReaderSystem.getLibrary().addBook(dsBook);
        onlineReaderSystem.getLibrary().addBook(algoBook);

        User user1 = new User(1, " ", "Gurpreet");
        User user2 = new User(2, " ", "Bedi");

        onlineReaderSystem.getUserManager().addUser(user1);
        onlineReaderSystem.getUserManager().addUser(user2);

        onlineReaderSystem.setActiveBook(algoBook);
        onlineReaderSystem.setActiveUser(user1);

        onlineReaderSystem.getDisplay().turnPageForward();
        onlineReaderSystem.getDisplay().turnPageForward();
        onlineReaderSystem.getDisplay().turnPageBackward();

        onlineReaderSystem.setActiveBook(dsBook);
        onlineReaderSystem.setActiveUser(user2);

        onlineReaderSystem.getDisplay().turnPageForward();
        onlineReaderSystem.getDisplay().turnPageForward();
        onlineReaderSystem.getDisplay().turnPageBackward();
    }
}
