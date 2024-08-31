package com.library.example;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrowBook();
                System.out.println("You borrowed: " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("You returned: " + title);
                return;
            }
        }
        System.out.println("Book was not borrowed.");
    }

    public void viewAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.title + " by " + book.author);
            }
        }
    }
}
