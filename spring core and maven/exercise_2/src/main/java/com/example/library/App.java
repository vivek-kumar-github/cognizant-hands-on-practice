package com.example.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            BookService bookService = context.getBean("bookService", BookService.class);
            System.out.println("Books from Spring DI:");
            bookService.getBooks().forEach(System.out::println);
        }
    }
}
