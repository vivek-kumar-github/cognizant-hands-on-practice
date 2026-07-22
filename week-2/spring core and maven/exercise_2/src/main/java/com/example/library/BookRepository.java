package com.example.library;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> findAllBooks() {
        return Arrays.asList("The Hobbit", "1984", "Pride and Prejudice");
    }
}
