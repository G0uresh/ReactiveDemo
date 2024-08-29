package com.gouresh.reactiveDemo.repository;

import com.gouresh.reactiveDemo.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Integer> {
}
