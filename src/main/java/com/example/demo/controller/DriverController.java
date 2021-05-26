package com.example.demo.controller;

import com.example.demo.domain.Driver;
import com.example.demo.service.DriverService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("driver")
public class DriverController {

  DriverService service;

  public DriverController(DriverService service) {
    this.service = service;
  }

  @GetMapping("/all")
  public List<Driver> allCars(){
    return this.service.getAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity carById(@PathVariable Integer id){
    Optional<Driver> car = this.service.getById(id);
    if(car.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(car.get()) ;
  }

  @PostMapping("/save")
  public ResponseEntity car( @RequestBody Driver driver){
    this.service.save(driver);
    return ResponseEntity.noContent().build();
  }
}
