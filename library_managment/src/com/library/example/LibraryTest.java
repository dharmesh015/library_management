package com.library.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);
        assertTrue(library.books.contains(book));
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);
        library.borrowBook("Effective Java");
        assertTrue(book.isBorrowed);
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);
        library.borrowBook("Effective Java");
        library.returnBook("Effective Java");
        assertFalse(book.isBorrowed);
    }

    @Test
    public void testViewAvailableBooks() {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook("Effective Java");
        library.viewAvailableBooks();
        assertTrue(book2.isAvailable());
        assertFalse(book1.isAvailable());
    }
}

