package com.example.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public LibraryService libraryService(BookRepository bookRepository) {
        return new LibraryService(bookRepository);
    }
}
