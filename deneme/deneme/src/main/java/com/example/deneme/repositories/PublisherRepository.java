package com.example.deneme.repositories;


import org.springframework.data.repository.CrudRepository;

import com.example.deneme.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
