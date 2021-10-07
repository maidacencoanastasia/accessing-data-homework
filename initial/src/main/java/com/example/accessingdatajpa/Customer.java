package com.example.accessingdatajpa;

import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "CustomerName")
    private String firstName;
    @Column(name ="ContactLastName")
    private String lastName;
    @Column(name ="Address")
    private String address;

    @Column(name ="City")
    private String city;

    @Column(name ="PostalCode")
    private String postalCode;

    @Column(name ="Country")
    private String country;
    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}