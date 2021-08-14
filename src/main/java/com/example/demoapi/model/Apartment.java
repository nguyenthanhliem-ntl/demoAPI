package com.example.demoapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long num;

    private String household;

    @OneToMany(targetEntity = Apartment.class)
    private List<Apartment> apartmentList;

    public Apartment() {
    }

    public Apartment(Long id, Long num, String household, List<Apartment> apartmentList) {
        this.id = id;
        this.num = num;
        this.household = household;
        this.apartmentList = apartmentList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }
}
