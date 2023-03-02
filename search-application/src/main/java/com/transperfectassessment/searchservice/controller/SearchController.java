package com.transperfectassessment.searchservice.controller;

import com.booksservice.booksservice.exception.ResourceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.transperfectassessment.searchservice.entity.Book;
import com.transperfectassessment.searchservice.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping
    public ResponseEntity<?> getAllBySearch(@RequestParam(value="q", defaultValue="") String query) throws ResourceNotFoundException {
        return new ResponseEntity<>(searchService.getAllBySearch(query), HttpStatus.OK);
    }
}
