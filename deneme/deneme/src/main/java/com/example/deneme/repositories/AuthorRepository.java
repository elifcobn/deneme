package com.example.deneme.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.deneme.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
