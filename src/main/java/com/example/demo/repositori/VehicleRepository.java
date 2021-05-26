package com.example.demo.repositori;

import com.example.demo.domain.Car;
import com.example.demo.domain.Vehicle;
import java.util.List;
import javax.persistence.Id;
import org.springframework.data.repository.CrudRepository;


public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

  public List<Vehicle> findAll();
}
