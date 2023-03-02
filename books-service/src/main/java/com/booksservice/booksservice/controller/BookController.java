package com.booksservice.booksservice.controller;

import com.booksservice.booksservice.repository.BookRepository;
import com.booksservice.booksservice.service.BookService;
import com.booksservice.booksservice.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookService bookService;


    Logger logger = LoggerFactory.getLogger(BookService.class);

    @GetMapping
    public ResponseEntity<?> getAllBooks() throws ResourceNotFoundException {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }
}
