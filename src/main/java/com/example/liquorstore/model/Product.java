package com.example.liquorstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.sql.BlobDBAccess;
import org.springframework.web.multipart.MultipartFile;
import javax.persistence.*;
import java.sql.Blob;


@Entity
@Table(name="PRODUCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PRODUCT")
    private Integer idProduct;

    @Column (name = "PRICE_PRODUCT", nullable = false)
    private Double priceProduct;

    @Column (name = "NAME_PRODUCT", nullable = false)
    private String nameProduct;

    @Column (name = "STOCK_PRODUCT", nullable = false)
    private Integer stockProduct;

    @Column (name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "IMG_PRODUCT")
    @Lob
    private Blob imgProduct;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(Integer stockProduct) {
        this.stockProduct = stockProduct;
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
