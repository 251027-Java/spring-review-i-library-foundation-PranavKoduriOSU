package com.revature.library.service;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * BookService - TODO: Implement using constructor injection
 */
@Service
public class BookService {

    // TODO: Declare a final BookRepository field
    // private final BookRepository bookRepository;

    // TODO: Create constructor that accepts BookRepository
    // public BookService(BookRepository bookRepository) {
    // this.bookRepository = bookRepository;
    // }

    public List<Book> getAllBooks() {
        // TODO: Return all books from repository
        return null;
    }

    public Optional<Book> findById(Long id) {
        // TODO: Find book by ID
        return Optional.empty();
    }

    public Book addBook(Book book) {
        // TODO: Save and return the book
        return null;
    }

    public Book checkoutBook(Long bookId) {
        // TODO: Find book, set available = false, save and return
        return null;
    }

    public Book returnBook(Long bookId) {
        // TODO: Find book, set available = true, save and return
        return null;
    }
}
