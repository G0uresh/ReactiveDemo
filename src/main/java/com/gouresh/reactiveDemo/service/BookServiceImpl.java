package com.gouresh.reactiveDemo.service;

import com.gouresh.reactiveDemo.model.Book;
import com.gouresh.reactiveDemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Mono<Book> createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Flux<Book> getAllBooks() {
        System.out.println("----->3"+Thread.currentThread().getName());
        return bookRepository.findAll().delayElements(Duration.ofSeconds(2));

    }

    @Override
    public Mono<Book> getBookById(int bookId) {
        return null;
    }

    @Override
    public Mono<Book> updateBook(Book book, int bookId) {
        return null;
    }

    @Override
    public Mono<Void> deleteBook(int bookId) {
        return null;
    }

    @Override
    public Flux<Book> search(String query) {
        return null;
    }
}
