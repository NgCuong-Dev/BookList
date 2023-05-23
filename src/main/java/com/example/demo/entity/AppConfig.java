package com.example.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks () {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1L);
        book1.setTitle("Lập trình WEB SPRING MVC");
        book1.setAuthor("Hiep Huynh");
        book1.setPrice(10.99);
        book1.setCategory("CNTT");
        books.add(book1);

        Book book2 = new Book();
        book2.setId(1L);
        book2.setTitle("Lập trình WEB SPRING MVC");
        book2.setAuthor("Minh Peo");
        book2.setPrice(10.99);
        book2.setCategory("CNTT");
        books.add(book2);

        Book book3 = new Book();
        book3.setId(1L);
        book3.setTitle("Lập trình WEB SPRING MVC");
        book3.setAuthor("Hiep Huynh");
        book3.setPrice(10.99);
        book3.setCategory("CNTT");
        books.add(book3);

        return books;
    }
}
