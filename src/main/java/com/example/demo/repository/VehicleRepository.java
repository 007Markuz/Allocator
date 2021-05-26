package com.example.demo.repository;

import com.example.demo.domain.Vehicle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

  public List<Vehicle> findAll();
}
