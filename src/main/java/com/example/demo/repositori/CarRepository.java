package com.example.demo.repositori;

import com.example.demo.domain.Car;
import java.util.List;
import javax.persistence.Id;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, Integer> {

  public List<Car> findAll();
}
