package com.example.demo.service;

import com.example.demo.domain.Car;
import java.util.List;

public interface VehicleService {


  public List<Car> get();

  Car getById(String id);

  public boolean save(Car car);


}
