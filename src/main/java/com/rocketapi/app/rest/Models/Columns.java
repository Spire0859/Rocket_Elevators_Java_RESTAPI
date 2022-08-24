package com.rocketapi.app.rest.Models;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.annotation.Generated;
import javax.persistence.*;


@Entity
public class Columns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String types;
    @Column
    private String status;
    @Column
    private String model;
    @Column
    private String numberFloorServed;
    @Column
    private String notes;
    @Column
    private String information;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private int battery_id;


    public int getId()
    {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getType() {

        return types;
    }

    public void setTypes(String types) {

        this.types = types;
    }

    public String  getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String  getNumberFloorServed() {

        return numberFloorServed;
    }

    public void setNumberFloorServed(String numberFloorServed) {

        this.numberFloorServed = numberFloorServed;
    }

    public String  getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInformation() {

        return information;
    }

    public void setInformation(String information) {

        this.information = information;
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

    public int getBattery_id() {

        return battery_id;
    }

    public void setBattery_id(int battery_id) {

        this.battery_id = battery_id;
    }



}