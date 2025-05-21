package com.example.demo.Tien_Ich;

import com.example.demo.Entity.Categories_Entity;

import java.sql.Timestamp;

public class Computer_DTO {
    private Long id;
    private String name;
    private Long price_from;
    private Long price_to;

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

    public Long getPrice_from() {
        return price_from;
    }

    public void setPrice_from(Long price_from) {
        this.price_from = price_from;
    }

    public Long getPrice_to() {
        return price_to;
    }

    public void setPrice_to(Long price_to) {
        this.price_to = price_to;
    }


}
