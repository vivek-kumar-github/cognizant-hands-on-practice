package com.example.library;

import java.util.List;

public class LibraryService {
    private final BookRepository bookRepository;

    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<String> getBooks() {
        return bookRepository.findAllBooks();
    }
}
