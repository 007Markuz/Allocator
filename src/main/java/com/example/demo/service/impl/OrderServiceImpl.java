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
    return Optional.of(this.getOrderDummy());
  }

  public List<Order> getAll(){
    return List.of(this.getOrderDummy());
  }
  public boolean save(Order order){
    return true;
  }

  private Order getOrderDummy(){
    return Order
        .builder()
        .driver(
            Driver
                .builder()
                .lastName("")
                .name("")
                .license(TypeVehicle.CAR)
                .build()
        )
        .destination("")
        .origin("")
        .vehicle(Vehicle
            .builder()
            .model("")
            .Colour("")
            .maximumLoad(0)
            .build()
        )
        .packet(Packet
            .builder()
            .weight(0)
            .isFragile(false)
            .build()
        )
        .build();
  }
}
