package com.example.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryApp {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(AppConfig.class)) {

            LibraryService service = context.getBean(LibraryService.class);
            System.out.println("Library books:");
            service.getBooks().forEach(System.out::println);
        }
    }
}
