package com.tpg.orderservice.service.impl;

import com.tpg.orderservice.model.Order;
import com.tpg.orderservice.repository.OrderRepository;
import com.tpg.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Order> getOrderList() {
        return orderRepository.findAll();
    }

}
