package com.example.deneme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.deneme.repositories.AuthorRepository;


@Controller
public class Authorcontroller {
    private final AuthorRepository authorRepository;

    public Authorcontroller(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
    }
    
    @RequestMapping("/authors")
    public String getAuthors( Model model) {
        
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";

    }
 
}