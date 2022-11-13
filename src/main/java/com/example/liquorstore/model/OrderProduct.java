package com.example.liquorstore.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table (name = "ORDER_PRODUCT")
@Data
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDER_PRODUCT")
    private Integer idOrderProduct;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "ID_ORDER")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "ID_PRODUCT")
    private Product product;

    @Column (name = "QUANTITY_ORDER_PRODUCT", nullable = false)
    private Integer quantity;

    public Integer getIdOrderProduct() {
        return idOrderProduct;
    }

    public void setIdOrderProduct(Integer idOrderProduct) {
        this.idOrderProduct = idOrderProduct;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
