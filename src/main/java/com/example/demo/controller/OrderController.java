package com.example.demo.controller;

import com.example.demo.domain.Order;
import com.example.demo.domain.Vehicle;
import com.example.demo.service.OrderService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

  OrderService service;

  public OrderController(OrderService service) {
    this.service = service;
  }

  @GetMapping("/all")
  public List<Order> allCars(){
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity carById(@PathVariable Integer id){
    Optional<Order> order = this.service.getById(id);
    if(order.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(order.get()) ;
  }

  @PostMapping("/save")
  public ResponseEntity car(@RequestBody Order order){
    this.service.save(order);
    return ResponseEntity.noContent().build();
  }
}
