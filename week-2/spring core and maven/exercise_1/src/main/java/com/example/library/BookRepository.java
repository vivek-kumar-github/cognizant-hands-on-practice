package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private final List<String> books = new ArrayList<>();

    public BookRepository() {
        books.add("The Hobbit");
        books.add("1984");
    }

    public List<String> findAllBooks() {
        return books;
    }
}
