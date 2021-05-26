package com.example.demo.controller;

import com.example.demo.domain.Vehicle;
import com.example.demo.service.VehicleService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("vehicle")
public class VehicleController {
  private VehicleService service;

  public VehicleController(VehicleService vehicleService) {
    this.service = vehicleService;
  }

  @GetMapping("/all")
  public List<Vehicle> allCars(){
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity carById(@PathVariable int id){
    Optional<Vehicle> vehicle = this.service.getById(id);
    if(vehicle.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(vehicle.get()) ;
  }



  @PostMapping("/save")
  public ResponseEntity car(@RequestBody Vehicle vehicle){
    this.service.save(vehicle);
    return ResponseEntity.noContent().build();
  }
}
