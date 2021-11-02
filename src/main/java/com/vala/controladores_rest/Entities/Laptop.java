package com.vala.controladores_rest.Entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    String name;
    boolean hasSD;

    public Laptop() {
    }

    public Laptop(Long id, String name, boolean hasSD) {
        this.id = id;
        this.name = name;
        this.hasSD = hasSD;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasSD() {
        return hasSD;
    }

    public void setHasSD(boolean hasSD) {
        this.hasSD = hasSD;
    }
}


