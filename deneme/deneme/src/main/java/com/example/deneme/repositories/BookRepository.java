package com.example.deneme.repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.deneme.domain.Book;

public interface BookRepository extends CrudRepository <Book, Long>  {
    
}
