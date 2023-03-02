package com.booksservice.booksservice.config;

import com.booksservice.booksservice.entity.Book;
import com.booksservice.booksservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... arg0) {

        bookRepository.deleteAll();

        Book book1 = new Book(null, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Book book2 = new Book(null, "To Kill a Mockingbird", "Harper Lee", "Fiction");
        Book book3 = new Book(null, "1984", "George Orwell", "Science Fiction");

        bookRepository.saveAll(Arrays.asList(book1, book2, book3));

    }
}
