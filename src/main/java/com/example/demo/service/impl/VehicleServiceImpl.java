package com.example.demo.service.impl;

import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements com.example.demo.service.VehicleService {

  public Optional<Vehicle> getById(String id){
    return Optional.of(this.getVehicleDummi());
  }

  public List<Vehicle> getAll(){
    return List.of(this.getVehicleDummi());
  }
  public boolean save(Vehicle vehicle){
    return true;
  }

  private Vehicle getVehicleDummi(){
    return Vehicle.builder().id("1").maximumLoad(100).Colour("red").model("model") .build();
  }
}
