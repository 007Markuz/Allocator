package com.example.demo.service;

import com.example.demo.domain.Car;
import com.example.demo.repositori.CarRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CarService implements VehicleService{

  private CarRepository carRepository;

  public CarService(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public Optional<Car> getById(Integer id){
    return this.carRepository.findById(id);
  }

  public List<Car> getAll(){
    return this.carRepository.findAll();
  }
  public boolean save(Car car){
    this.carRepository.save(car);
    return true;
  }

}
