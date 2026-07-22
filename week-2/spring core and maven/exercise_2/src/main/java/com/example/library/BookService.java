package com.example.library;

import java.util.List;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<String> getBooks() {
        return bookRepository.findAllBooks();
    }
}
