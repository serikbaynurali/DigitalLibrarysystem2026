package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.database.DatabaseConnection;
import com.example.demo.exceptions.AuthorNotFoundException;
import com.example.demo.model.Author;
import org.springframework.stereotype.Service;

import java.sql.*;

import static java.awt.AWTEventMulticaster.add;
@Service

public class AuthorService {

    public Author getAuthorById(int author_id) throws SQLException, AuthorNotFoundException {
        String sql = "SELECT * FROM authors WHERE author_id = ?";
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, author_id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return new Author(rs.getString("name"), rs.getString("surname"), rs.getString("email"), rs.getString("phone"),rs.getString("address") );
        } else {
            throw new AuthorNotFoundException("Author with ID " + author_id + " not found.");
        }
    }

    public List<Author> getAllAuthors() throws SQLException, AuthorNotFoundException {
        List<Author> authors=new ArrayList<Author>();
        String sql = "SELECT * FROM authors";
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Author author = new Author(
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("email"),
                    rs.getString("phone"),
                    rs.getString("address") );

            authors=add(author);
        }
        return authors;

        }

    private List<Author> authors = new ArrayList<>();

    private List<Author> add(Author author) {
        authors.add(author);
        return authors;
    }

}

