package com.example.demo.service;

import com.example.demo.domain.Car;

public interface VehicleService {


  public Car get();
  public boolean save(Car car);
}
