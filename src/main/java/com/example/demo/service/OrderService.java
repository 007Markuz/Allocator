package com.example.demo.service;

import com.example.demo.domain.Order;
import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;

public interface OrderService {
  public List<Order> getAll();

  public Optional<Order> getById(Integer id);

  public boolean save(Order order);
}
