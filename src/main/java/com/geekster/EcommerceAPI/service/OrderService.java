package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Orders;
import com.geekster.EcommerceAPI.repository.IOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderDao orderDao;

    public void addOrders(Orders order) {
        orderDao.save(order);
    }

    public List<Orders> getOrderById(Integer orderId) {
        return orderDao.findByOrderId(orderId);
    }
}
