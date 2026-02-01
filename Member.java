package com.example.demo.model;

import java.util.ArrayList;

public class Member extends Person {

    ArrayList<Member>members = new ArrayList<Member>();

    public char addMember(Member m) {
        members.add(m);
        return 0;
    }
    public void removeAuthor(Member m) {
        members.remove(m);
    }
    public void searchAuthor(Member m) {
        for (Member member : members) {
            if (member.equals(m)) {
                System.out.println(member.toString());
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

    public Member(String name, String surname, String email, String phone, String address) {
        super(name,surname,email,phone,address);

    }
    public void setMembers(ArrayList<Author> authors) {
        this.members = members;
    }
    public ArrayList<Member> getMembers() {
        return members;
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

    @Override
    public String toString() {
        return super.toString() ;
    }


}


