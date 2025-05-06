package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book != null){
            books.add(book);
        } else {
            throw new IllegalArgumentException("Book cannot be null");
        }
    }

    public boolean removeBook(Book book) {
        if (book != null) {
            return books.remove(book);
        } else {
            throw new IllegalArgumentException("Book cannot be null");
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getBookCount() {
        return books.size();
    }
}
