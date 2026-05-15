package com.phat.shoestore.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class ProductClass {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn (name = "brand_id")
    private BrandClass brand;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryClass category;
    private String name;
    private String description;
    @Column(name = "image_url")
    private String image;
    private String status="ACTIVE";
    @Column(name = "created_at")
    private LocalDateTime created;
    @Column(name = "updated_at")
    private LocalDateTime updated;

    public ProductClass() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BrandClass getBrand() {
        return brand;
    }

    public void setBrand(BrandClass brand) {
        this.brand = brand;
    }

    public CategoryClass getCategory() {
        return category;
    }

    public void setCategory(CategoryClass category) {
        this.category = category;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
