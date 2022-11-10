package com.example.liquorstore.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    @Column(nullable = false, unique = true, length = 45)
    private String productName;

    @Column(name = "unit_price", nullable = false, length = 20)
    private Integer unitPrice;

    @Column(name = "stock", nullable = false, length = 20)
    private Integer stock;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "IMG_PRODUCT")
    @Lob
    private Blob imgProduct;

    public Double getId() {
        return id;
    }
    public void setId(Double id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Integer getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Blob getImgProduct() {
        return imgProduct;
    }
    public void setImgProduct(Blob imgProduct) {
        this.imgProduct = imgProduct;
    }
}
