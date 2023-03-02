package com.transperfectassessment.searchservice.controller;

import com.transperfectassessment.searchservice.SearchServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {SearchServiceApplication.class})
public class SearchControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    //The docker compose needs to be running

    @Test
    public void testGetAllBooks() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "http://localhost:8081/books",
                String.class);
        assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
    }

    @Test
    public void testGetAllBooksByQuery() {
        ResponseEntity<String> response = restTemplate.getForEntity(
                "http://localhost:8080/search?q=fic",
                String.class);
        assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
    }
}
