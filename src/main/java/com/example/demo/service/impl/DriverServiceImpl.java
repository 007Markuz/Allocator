package com.example.demo.service.impl;

import com.example.demo.domain.Driver;
import com.example.demo.domain.TypeVehicle;
import com.example.demo.service.DriverService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

  @Override
  public List<Driver> getAll() {
    return this.getListDummy();
  }

  @Override
  public Optional<Driver> getById(Integer id) {
    return Optional.of(this.getDummy(20,TypeVehicle.CAR));
  }

  @Override
  public boolean save(Driver driver) {
    return false;
  }

  public List<Driver> getTruckNewDriver(){
    List<Driver> list =this.getListDummy();

    List<Driver> newList =new ArrayList<>();

    for ( Driver element: list ) {
      if(
          element.getAge() > 25 &&
          element.getAge() < 55 &&
          element.getLicense().equals(TypeVehicle.CAR)
      )
      newList.add(element);
    }
    return newList;
  }

  private Driver getDummy(int age, TypeVehicle license){
    return Driver
        .builder()
        .id("1")
        .lastName("")
        .name("")
        .age(age)
        .license(license)
        .build();
  }

  private List<Driver> getListDummy(){
    return  List.of(
        this.getDummy(20,TypeVehicle.MOTORCYCLE),
        this.getDummy(28,TypeVehicle.CAR),
        this.getDummy(30,TypeVehicle.CAR),
        this.getDummy(40,TypeVehicle.MOTORCYCLE),
        this.getDummy(50,TypeVehicle.CAR),
        this.getDummy(60,TypeVehicle.TRUCK)
    );
  }
}
