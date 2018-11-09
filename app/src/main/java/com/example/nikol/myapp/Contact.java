package com.example.nikol.myapp;

import java.util.ArrayList;

public class Contact {

    private String name;
    private String number;
    private String email;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static int id = 1;

    public static ArrayList<Contact> createContactsList(int numContacts) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 1; i <= numContacts; i++) {
            Contact contact = new Contact("Osoba " + id);
            id++;
            contact.number = "01 2006 789";
            contact.email = "osoba.osobica@gmail.com";
            contacts.add(contact);
        }

        return contacts;
    }
}
