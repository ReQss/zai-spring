package com.triptip.triptip.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.JoinType;

@Entity
@Table(name = "items")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "imageurl")
    private String imageSrc;
    private int stock;
    @Column(name = "price")
    private float price;
    @JoinColumn (name = "platformid")
    private int platformId;
    @JoinColumn(name = "categoryid")
    private int categoryId;
    public int getId() {
        return id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int quantity) {
        this.stock = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPlatformId() {
        return platformId;
    }

    public void setPlatformId(int platformId) {
        this.platformId = platformId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", quantity=" + stock +
                ", price=" + price +
                ", platformId=" + platformId +
                ", categoryId=" + categoryId +
                '}';
    }
}
