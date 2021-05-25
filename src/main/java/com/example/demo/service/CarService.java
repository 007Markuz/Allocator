package com.example.demo.service;

import com.example.demo.domain.Car;
import org.springframework.stereotype.Service;

@Service
public class CarService implements VehicleService{

  public Car get(){
    return new Car();
  }
  public boolean save(Car car){
    return true;
  }

}
