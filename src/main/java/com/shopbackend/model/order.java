package com.shopbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;

    public order() {}

    public order(String details) {
        this.details = details;
    }

    // getters and setters
    public Long getId() { return id; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
