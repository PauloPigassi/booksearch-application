package com.transperfectassessment.searchservice.service;

import com.booksservice.booksservice.exception.ResourceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.transperfectassessment.searchservice.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class SearchService {

    Logger logger = LoggerFactory.getLogger(SearchService.class);

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public List<Book> getAllBySearch(String query) throws ResourceNotFoundException {
        logger.info("Getting all books by query ----");

        ResponseEntity<Object[]> responseEntity =
                restTemplate().getForEntity("http://books-service:8081/books", Object[].class);

        Object[] objects = responseEntity.getBody();
        ObjectMapper mapper = new ObjectMapper();

        List<Book> filteredList = Arrays.stream(objects)
                .map(object -> mapper.convertValue(object, Book.class))
                .filter(book -> book.getAuthor().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))
                        || book.getCategory().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))
                        || book.getTitle().toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)))
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());


        if (filteredList.isEmpty()){
            throw new ResourceNotFoundException("There aren't books to show");
        }
        else {
            return filteredList;
        }
    }
}
