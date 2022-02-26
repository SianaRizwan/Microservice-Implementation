package com.example.orderserviceapplication.controller;



import com.example.orderserviceapplication.entity.Order;
import com.example.orderserviceapplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Order saveEmployee(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Order findEmployeeById(@PathVariable("id") String orderId){
        return orderService.findOrderById(orderId);
    }
}
