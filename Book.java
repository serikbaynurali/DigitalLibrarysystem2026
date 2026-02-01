package com.example.demo.model;

import java.util.Objects;

public class Book {
    public int id;
    public String title;


    public String published_year;
    public double price;
    public String author_id;
    public boolean isLoaned;
    public String author;

    public Book(int id, String title, String published_year, double price, String author_id, String author) {
        this.id = id;
        this.title = title;

        this.published_year = published_year;
        this.price = price;
        this.author_id = author_id;
        this.isLoaned = false;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }public String getPublished_year() {
        return published_year;
    }
    public void setPublished_year(String published_year) {
        this.published_year = published_year;
    }


    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthor_id() {
        return author_id;
    }
    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }
    public boolean isLoaned() {
        return isLoaned;
    }
    public void setLoaned(boolean loaned) {
        this.isLoaned = loaned;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public void displayInfo() {
        System.out.println("Title: " + title +" " +"Author-> " +  author+" " + author_id + ", Loaned: " + isLoaned);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author_id == book.author_id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, author_id);
    }
}




