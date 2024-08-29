package com.gouresh.reactiveDemo.controller;

import com.gouresh.reactiveDemo.model.Book;
import com.gouresh.reactiveDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Create a new book
    @PostMapping
    public Mono<Book> createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    // Get all books
    @GetMapping
    public Flux<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Get a book by ID
    @GetMapping("/{id}")
    public Mono<Book> getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

//    // Update a book
//    @PutMapping("/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
//        return bookService.updateBook(id, bookDetails)
//                .map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    // Delete a book
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
//        if (bookService.deleteBook(id)) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}