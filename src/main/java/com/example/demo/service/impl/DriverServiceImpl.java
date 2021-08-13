package com.example.demo.service.impl;

import com.example.demo.domain.Driver;
import com.example.demo.domain.TypeVehicle;
import com.example.demo.repository.DriverRepository;
import com.example.demo.service.DriverService;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

  DriverRepository repository ;

  public DriverServiceImpl(DriverRepository repository) {



    this.repository = repository;
  }


  @Override
  public List<Driver> getAll() {
    return this.repository.findAll();
  }


  @Override
  public List<Driver> getAllFilter() {

    List<Driver> list = this.repository.findAll();

    return list.stream().parallel().filter(
        driver -> driver.getId()>20
    ).collect(Collectors.toList());

  }


  @Override
  public Optional<Driver> getById(Integer id) {
    return this.repository.findById(id);
  }

  @Override
  public boolean save(Driver driver) {

    this.repository.saveDriver(driver.getName(),driver.getLastName(),driver.getLicense().getId());

    return true;

  }

  private Driver getDummy(){
  return null;
    /*return Driver
        .builder()
        .id(1)
        .lastName("")
        .name("")
        .license(TypeVehicle.CAR)
        .build();*/
  }
}
