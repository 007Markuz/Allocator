package com.example.demo.service.impl;

import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;
import javax.persistence.Column;
import org.springframework.stereotype.Service;

@Service
public class @Column(name="maximumload")ServiceImpl implements com.example.demo.service.VehicleService {


  public Optional<Vehicle> getById(Integer id){
    return Optional.of(this.getVehicleDummi());
  }

  public List<Vehicle> getAll(){
    return List.of(this.getVehicleDummi());
  }
  public boolean save(Vehicle vehicle){
    return true;
  }

  private Vehicle getVehicleDummi(){
    return Vehicle.builder().maximumLoad(100).Colour("red").model("model") .build();
  }
}
