package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.service.VehicleService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CarController {
  private VehicleService vehicleService;

  public CarController(VehicleService vehicleService) {
    this.vehicleService = vehicleService;
  }

  @GetMapping("/allcars")
  public List<Car> allCars(){
    return this.vehicleService.getAll();
  }

  @GetMapping("/car/{id}")
  public ResponseEntity carById(@PathVariable Integer id){
    Optional<Car> car = this.vehicleService.getById(id);
    if(car.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(car.get()) ;
  }

  @PostMapping("/savecar")
  public ResponseEntity car(@RequestBody Car car){
    this.vehicleService.save(car);
    return ResponseEntity.noContent().build();
  }
}
