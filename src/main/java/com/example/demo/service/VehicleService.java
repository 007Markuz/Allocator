package com.example.demo.service;

import com.example.demo.domain.Car;
import java.util.List;
import java.util.Optional;

public interface VehicleService {


  public List<Car> getAll();

  public Optional<Car> getById(Integer id);

  public boolean save(Car car);


}
