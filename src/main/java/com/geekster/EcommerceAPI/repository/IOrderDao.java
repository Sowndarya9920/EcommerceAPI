package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderDao extends JpaRepository<Orders,Integer> {

    public List<Orders> findByOrderId(Integer orderId);

}
