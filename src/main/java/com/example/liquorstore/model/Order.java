package com.example.liquorstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_TABLE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDER")
    private Integer idOrder;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_USER")
    private User user;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    private Integer getIdOrder(){
        return this.idOrder;
    }

    private User getUser(){
        return this.user;
    }

    private String getAddress(){
        return this.address;
    }

    private void setIdOrder(Integer id){
        this.idOrder = id;
    }

    private void setUserOrder(User nUsr){
        this.user = nUsr;
    }

    private void setAddressOrder(String nAddr){
        this.address = nAddr;
    }
}
