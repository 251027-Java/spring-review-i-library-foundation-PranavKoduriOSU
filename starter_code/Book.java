package com.revature.library.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Book Entity - TODO: Complete the annotations
 */
// TODO: Add @Entity annotation
// TODO: Add @Table(name = "books") annotation
public class Book {

    // TODO: Add @Id and @GeneratedValue annotations
    private Long id;

    // TODO: Add @Column(nullable = false) annotation
    private String title;

    // TODO: Add @Column(nullable = false) annotation
    private String author;

    // TODO: Add @Column(unique = true) annotation
    private String isbn;

    private boolean available = true;

    private LocalDateTime createdAt;

    // Default constructor required by JPA
    public Book() {
        this.createdAt = LocalDateTime.now();
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.createdAt = LocalDateTime.now();
    }

    // TODO: Generate getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add remaining getters/setters...
}
