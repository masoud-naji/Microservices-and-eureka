package com.udacity.microservices.repository;

import com.udacity.microservices.entity.dog;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<dog, Long> {
}


