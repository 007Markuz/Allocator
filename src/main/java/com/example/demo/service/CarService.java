package com.example.demo.service;

import com.example.demo.domain.Car;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CarService implements VehicleService{

  public Optional<Car> getById(Integer id){
    return Optional.of(Car.builder().maximumLoad("100").Colour("red").model("model").build());
  }

  public List<Car> getAll(){
    return List.of(Car.builder().maximumLoad("100").Colour("red").model("model") .build());
  }
  public boolean save(Car car){
    return true;
  }

}
