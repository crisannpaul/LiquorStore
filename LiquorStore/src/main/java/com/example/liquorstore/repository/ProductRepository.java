package com.example.liquorstore.repository;

import com.example.liquorstore.model.Product;
import com.example.liquorstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE p.productName = ?1")
    public Product findByProductName(String productName);
}
