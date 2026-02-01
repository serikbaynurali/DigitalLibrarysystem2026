package com.example.demo.model;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void loanBook(Book book, Member member) {
        if (book.isLoaned()) {
            System.out.println(" Бұл кітап қазір қарызда!");
        } else {
            book.setLoaned(true);
            loans.add(new Loan(book, member));
            System.out.println(" Кітап берілді: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook() == book) {
                book.setLoaned(false);
                loans.remove(loan);
                System.out.println(" Кітап қайтарылды: " + book.getTitle());
                return;
            }
        }
        System.out.println(" Бұл кітап қарызда емес!");
    }

    public void showLoansByMember(Member member) {
        System.out.println(member.getName() + " алған кітаптар:");
        for (Loan loan : loans) {
            if (loan.getMember() == member) {
                System.out.println("- " + loan.getBook().getTitle());
            }
        }
    }

    public void showAllBooks() {
        System.out.println(" Кітаптар тізімі:");
        for (Book b : books) {
            b.displayInfo();
        }
    }
}
