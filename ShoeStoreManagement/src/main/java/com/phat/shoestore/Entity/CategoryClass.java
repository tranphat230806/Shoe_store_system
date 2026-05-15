package com.phat.shoestore.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "categories")
public class CategoryClass {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @Column (name = "created_at")
    private LocalDateTime created;

    public CategoryClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
