# Spring Core Exercise 2

This project demonstrates basic dependency injection using Spring XML configuration.

## Components
- `BookRepository`: provides book data
- `BookService`: depends on `BookRepository`
- `applicationContext.xml`: wires the objects together
- `App`: loads the Spring context and prints the books

## Run
From this folder, compile and run:

```bash
javac -cp "lib/*" -d target/classes src/main/java/com/example/library/*.java
java -cp "target/classes;lib/*" com.example.library.App
```
