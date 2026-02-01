package com.example.demo.controller;

import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.BookService; import java.sql.SQLException;
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public Book getBookBy(@PathVariable Integer id) throws SQLException, BookNotFoundException {
        return bookService.getBookById(id);
    }
}

