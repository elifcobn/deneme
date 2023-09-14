package com.example.deneme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deneme.repositories.BookRepository;


@RestController
public class Bookcontroller {
    
    private final BookRepository bookRepository;

     public Bookcontroller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(path = "/books")
    public String Books() {
        return "books/list";
    }

}
