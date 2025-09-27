package com.tot;

public class Customer {

    private String name;
    private String email;
    private String contact;
    private Car car;

    // Setter & Getter for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Setter & Getter for email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    // Setter & Getter for contact
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getContact() {
        return contact;
    }

    // Setter & Getter for car
    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }
}

