package com.example.demo.service;

import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;

public interface VehicleService {


  public List<Vehicle> getAll();

  public Optional<Vehicle> getById(String id);

  public boolean save(Vehicle vehicle);


}
