package com.example.demo.model;

public class Person {
    public int id;
    public String name;
    public String surname;
    public String email;
    public String phone;
    public String address;

    public Person(String name, String surname, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "ID:" + id+ ", Name: " + name + ", Surname: " + surname + ", Email: " + email + ", Phone: " + phone + ", Address: " + address;
    }

}

