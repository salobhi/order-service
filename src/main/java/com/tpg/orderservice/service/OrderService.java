package com.tpg.orderservice.service;

import com.tpg.orderservice.model.Order;

import java.util.List;


public interface OrderService {
    Order addOrder(Order order);

    Order findOrderById(Long id);

    List<Order> getOrderList();
}
