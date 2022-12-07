package com.example.liquorstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.liquorstore.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Integer>{
    //@Query("SELECT op from OrderProduct op where op.order.user.id = :id and op.order.idOrder = :orderId")
    //List<OrderProduct> findAllByUserAndOrder(@Param("orderId") Integer orderId, @Param("idUser") Integer userId);

    //@Query("SELECT op from OrderProduct op where op.order.user.id = :id")
    //List<OrderProduct> findAllByUser(@Param("idUser") Integer userId);
}
