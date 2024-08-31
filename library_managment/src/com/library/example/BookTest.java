package com.library.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        assertEquals("Effective Java", book.title);
        assertEquals("Joshua Bloch", book.author);
        assertFalse(book.isBorrowed);
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        book.borrowBook();
        assertTrue(book.isBorrowed);
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("Effective Java", "Joshua Bloch");
        book.borrowBook();
        book.returnBook();
        assertFalse(book.isBorrowed);
    }
}

