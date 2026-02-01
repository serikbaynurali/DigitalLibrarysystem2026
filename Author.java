package com.example.demo.model;

import java.util.ArrayList;

public class Author extends Person {



    ArrayList<Author>authors = new ArrayList<Author>();



    public char addAuthor(Author a) {
        authors.add(a);
        return 0;
    }
    public void removeAuthor(Author a) {
        authors.remove(a);
    }
    public void searchAuthor(Author a) {
        for (Author author : authors) {
            if (author.equals(a)) {
                System.out.println(author.toString());
            }
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);

    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }
    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    public Author(String name, String surname, String email, String phone, String address) {
        super(name,surname,email,phone,address);

    }
    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }


    public String getAddress() {
        return super.getAddress();
    }


    public String getEmail() {
        return super.getEmail();
    }

    public int getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return super.toString() ;
    }


}

