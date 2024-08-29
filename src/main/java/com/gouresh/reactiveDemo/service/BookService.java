package com.gouresh.reactiveDemo.service;

import com.gouresh.reactiveDemo.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Mono<Book> createBook(Book book);

    Flux<Book> getAllBooks();

    Mono<Book> getBookById(int bookId);

    public Mono<Book> updateBook(Book book, int bookId);

    public Mono<Void> deleteBook(int bookId);

    public Flux<Book> search(String query);
}
