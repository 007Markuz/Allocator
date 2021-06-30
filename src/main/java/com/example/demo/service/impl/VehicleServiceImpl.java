package com.example.demo.service.impl;

import com.example.demo.domain.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import java.util.List;
import java.util.Optional;
import javax.persistence.Column;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

  VehicleRepository repository;

  public VehicleServiceImpl(VehicleRepository repository) {
    this.repository = repository;
  }

  public Optional<Vehicle> getById(int id){

    return this.repository.findById(id);
  }

  public List<Vehicle> getAll(){
    return this.repository.findAll();
  }


  public boolean save(Vehicle vehicle){
    this.repository.save(vehicle);
    return true;
  }

}
