package com.example.demo.service.impl;

import com.example.demo.domain.Driver;
import com.example.demo.domain.Order;
import com.example.demo.domain.Packet;
import com.example.demo.domain.TypeVehicle;
import com.example.demo.domain.Vehicle;
import com.example.demo.service.OrderService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  public Optional<Order> getById(Integer id){
    return Optional.empty();
  }

  public List<Order> getAll(){
    return List.of();
  }
  public boolean save(Order order){
    return true;
  }

  /*
  private Order getOrderDummy(){
    return Order
        .builder()
        .driver(
            Driver
                .builder()
                .id(1)
                .lastName("")
                .name("")
                .license(TypeVehicle.CAR)
                .build()
        )
        .destination("")
        .origin("")
        .vehicle(Vehicle
            .builder()
            .id(1)
            .model("")
            .colour("")
            .maximumLoad(0)
            .build()
        )
        .packet(Packet
            .builder()
            .id("1")
            .weight(0)
            .isFragile(false)
            .build()
        )
        .build();
  }*/
}
