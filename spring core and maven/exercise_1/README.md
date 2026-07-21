# Spring Core Exercise 1

This project demonstrates a basic Spring application for a library management example.

## What it contains
- `AppConfig` for Spring bean configuration
- `BookRepository` as a simple repository
- `LibraryService` as a service using the repository
- `LibraryApp` as the entry point

## How to run
From this folder, run:

```bash
mvn spring-boot:run
```

If Maven is not installed, use the Java command with the downloaded Spring jars:

```bash
javac -cp "lib/*" -d target/classes src/main/java/com/example/library/*.java
java -cp "target/classes;lib/*" com.example.library.LibraryApp
```
