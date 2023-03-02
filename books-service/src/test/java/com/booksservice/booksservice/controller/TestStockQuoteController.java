//package com.booksservice.booksservice.controller;
//
//import com.quotationManager.quotationManager.QuotationManagerApplication;
//import com.booksservice.booksservice.entity.StockQuote;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {QuotationManagerApplication.class})
//public class TestStockQuoteController {
//
//    @LocalServerPort
//    private int port;
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//
//    @Test
//    public void testCreate() {
//        StockQuote stockQuote = new StockQuote();
//        stockQuote.stockId = "aapl34";
//        stockQuote.price = 20.0;
//        ResponseEntity<String> response = restTemplate.postForEntity(
//                "http://localhost:8081/stockQuote",stockQuote,
//                String.class);
//        assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.CREATED);
//    }
//
//    @Test
//    public void testGetAll() {
//        ResponseEntity<String> response = restTemplate.getForEntity(
//                "http://localhost:8081/stockQuote",
//                String.class);
//        assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
//    }
//
//    @Test
//    public void testGetById() {
//        ResponseEntity<String> response = restTemplate.getForEntity(
//                "http://localhost:8081/stockQuote/2",
//                String.class);
//        assertThat(response.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);
//    }
//
//    @Test
//    public void testDelete() {
//        restTemplate.delete("http://localhost:8081/stockcache");
//    }
//}
