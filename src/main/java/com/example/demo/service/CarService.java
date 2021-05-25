package com.example.demo.service;

import com.example.demo.domain.Car;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService implements VehicleService{

  public Car getById(String id){
    return new Car();
  }

  public List<Car> get(){
    return List.of(new Car());
  }
  public boolean save(Car car){
    return true;
  }

}
