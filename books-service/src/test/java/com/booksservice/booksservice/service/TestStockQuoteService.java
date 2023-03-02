//package com.booksservice.booksservice.service;
//
//import com.quotationManager.quotationManager.QuotationManagerApplication;
//import com.booksservice.booksservice.entity.StockQuote;
//import com.booksservice.booksservice.repository.StockQuoteRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {QuotationManagerApplication.class})
//public class TestStockQuoteService {
//
//    @LocalServerPort
//    private int port;
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    StockQuoteRepository stockQuoteRepository;
//
//    @Test
//    public void testGetQuote() {
//        StockQuote stockQuote = new StockQuote();
//        stockQuote.id = 2;
//        stockQuote.stockId = "aapl34";
//        stockQuote.price = 20.0;
//        Optional<StockQuote> model = stockQuoteRepository.findById(stockQuote.id);
//        assertThat(model).isNotNull();
//    }
//}