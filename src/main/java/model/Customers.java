package model;

import java.util.List;

public class Customers {
    int id;
    String name;
    String surname;
    int age;
    List<Contacts> contacts;

    public Customers(String name, String surname, int age, List<Contacts> contacts) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
