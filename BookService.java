package com.example.demo.services;

import com.example.demo.database.DatabaseConnection;
import com.example.demo.exceptions.BookNotFoundException;
import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.sql.*;
@Service

public class BookService {

    private BookService() {
    }



    public  Book getBookById(int bookId) throws SQLException, BookNotFoundException {
        String sql = "SELECT * FROM books WHERE book_id = ?";
        Connection connection = DatabaseConnection.getConnection();
        assert connection != null;
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, bookId);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("published_year"),rs.getDouble("price"), rs.getString("author_id"), rs.getString("author") );
        } else {
            throw new BookNotFoundException("Book with ID " + bookId + " not found.");
        }
    }

    public void addBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (book_id, title,price) VALUES (?, ?,?)";
        Connection connection = DatabaseConnection.getConnection();
        assert connection != null;
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, book.getId());
        pstmt.setString(2, book.getTitle());
        pstmt.setDouble(3, book.getPrice());
        pstmt.executeUpdate();
    }

}
