package com.rocketapi.app.rest.Models;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.Generated;
import javax.persistence.*;


@Entity
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String address_type;
    @Column
    private String status;
    @Column
    private String numberAndStreet;
    @Column
    private String suiteOrApartment;
    @Column
    private String city;
    @Column
    private String postal_code;
    @Column
    private String country;
    @Column
    private String notes;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private int customer_id;
    @Column
    private int building_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setEmail(String address_type) {
        this.address_type = address_type;
    }

    public String  getNumberAndStreet() {
        return numberAndStreet;
    }

    public void setNumberAndStreet(String numberAndStreet) {
        this.numberAndStreet = numberAndStreet;
    }

    public String  getSuiteOrApartment() {
        return suiteOrApartment;
    }

    public void setSuiteOrApartment(String suiteOrApartment) {
        this.suiteOrApartment = suiteOrApartment;
    }

    public String  getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String  getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String  getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String  getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String  getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(int building_id) {
        this.building_id = building_id;
    }



}