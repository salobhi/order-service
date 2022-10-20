package com.tpg.orderservice.controller;

import com.tpg.orderservice.constants.URI;
import com.tpg.orderservice.model.Order;
import com.tpg.orderservice.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin("*")
@RefreshScope
@RestController
@RequestMapping(URI.API + URI.VERSION)
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/message")
    public ResponseEntity<String> getMsg() {
        return ResponseEntity.ok(message);
    }

    @PostMapping(URI.ORDER)
    public ResponseEntity<Order> addOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.addOrder(order));
    }

    @GetMapping(URI.ORDER + "/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.findOrderById(id));
    }

    @GetMapping(URI.ORDER + URI.ALL)
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getOrderList());
    }


}
