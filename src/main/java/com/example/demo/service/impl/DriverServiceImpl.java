package com.example.demo.service.impl;

import com.example.demo.domain.Driver;
import com.example.demo.domain.TypeVehicle;
import com.example.demo.service.DriverService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

  @Override
  public List<Driver> getAll() {
    return List.of(this.getDummy());
  }

  @Override
  public Optional<Driver> getById(Integer id) {
    return Optional.of(this.getDummy());
  }

  @Override
  public boolean save(Driver driver) {
    return false;
  }

  private Driver getDummy(){
    return Driver
        .builder()
        .id("1")
        .lastName("")
        .name("")
        .license(TypeVehicle.CAR)
        .build();
  }
}
