package com.booksservice.booksservice.service;

import com.booksservice.booksservice.entity.Book;
import com.booksservice.booksservice.exception.ResourceNotFoundException;
import com.booksservice.booksservice.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookService {

    Logger logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() throws ResourceNotFoundException {
        logger.info("Getting all books ----");
        List<Book> bookList = bookRepository.findAll();
        if (bookList.isEmpty()){
            throw new ResourceNotFoundException("There aren't books to show");
        }
        else {
            return bookList;
        }
    }
}
