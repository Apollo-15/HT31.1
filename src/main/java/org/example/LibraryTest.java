package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @BeforeEach
    public void setUp() {
        book1 = new Book();
        book1.setTitle("Brief History of Time");
        book1.setAuthor("Stephen Hawking");

        book2 = new Book();
        book2.setTitle("Theory Of Everything");
        book2.setAuthor("Stephen Hawking");

        book3 = new Book();
        book3.setTitle("The Evolution of Physics");
        book3.setAuthor("Albert Einstein");

        book4 = new Book();
        book4.setTitle("God doesn't play dice");
        book4.setAuthor("Albert Einstein");

        book5 = new Book();
        book5.setTitle("Black Holes and Baby Universes and other Essays");
        book5.setAuthor("Stephen Hawking");

        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }

    @Test
    public void testGetBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        List<Book> books = library.getBooks();
        assert books.size() == 5;
        assert books.contains(book1);
        assert books.contains(book2);
        assert books.contains(book3);
        assert books.contains(book4);
        assert books.contains(book5);
    }

    @Test
    public void testRemoveBook() {
        library.removeBook(book1);
        library.removeBook(book2);
        library.removeBook(book3);
        library.removeBook(book4);
        library.removeBook(book5);

        List<Book> books = library.getBooks();
        assert books.size() == 0;
    }

    @Test
    public void testGetBookCount() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        int count = library.getBookCount();
        assert count == 5;
    }

    @Test
    public void testAddNullBook() {
        try {
            library.addBook(null);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Book cannot be null");
        }
    }

}