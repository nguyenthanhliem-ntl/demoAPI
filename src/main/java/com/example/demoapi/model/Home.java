package com.example.demoapi.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "home")
public class Home {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String address;

    private String name;
    @ManyToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;


    public Home() {
    }

    public Home(Long id, String address, String name, Apartment apartment) {
        Id = id;
        this.address = address;
        this.name = name;
        this.apartment = apartment;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
