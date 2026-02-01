package com.example.demo.model;

public class Loan {
    public Book book;
    public Member member;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() { return book; }
    public Member getMember() { return member; }

    public void displayInfo() {
        System.out.println(book.getTitle() + " -> " + member.getName());
    }
}
