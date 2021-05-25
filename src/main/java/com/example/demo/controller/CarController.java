package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.service.VehicleService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("car")
public class CarController {
  private VehicleService vehicleService;

  public CarController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @GetMapping
  public List<Car> allCars(){
    return this.vehicleService.get();
  }

  @GetMapping("/{id}")
  public Car carById(@PathVariable String id){
    return this.vehicleService.getById(id);
  }

  @PostMapping("save")
  public ResponseEntity car(@RequestBody Car car){
    this.vehicleService.save(car);
    return ResponseEntity.noContent().build();
  }
}
