package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
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
  public Car save(){
    return this.vehicleService.get();
  }


  @PostMapping("save")
  public void save(@RequestBody Car car){
    this.vehicleService.save(car);
  }
}
