package com.example.demo.service.impl;

import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements com.example.demo.service.VehicleService {

  public Optional<Vehicle> getById(String id){
    return Optional.of(
        this.getVehicleDummi("1",100,"","")
    );
  }


  public List<Vehicle> getAll(){
    return this.getDummyList();
  }


  public boolean save(Vehicle vehicle){
    return true;
  }



  public List<Vehicle> getRedHevy(){
    List<Vehicle> list = this.getDummyList();
    return list.stream().filter( vehicle -> (
              vehicle.getColour() =="red" && vehicle.getMaximumLoad() >200
    )).collect(Collectors.toList());

  }

  private List<Vehicle> getDummyList(){
    return List.of(
        this.getVehicleDummi("1",100,"red",""),
        this.getVehicleDummi("2",200,"blue",""),
        this.getVehicleDummi("3",300,"red",""),
        this.getVehicleDummi("4",400,"orange","")
    );
  }

  private Vehicle getVehicleDummi(String id,int maximumLoad, String colour, String model ){
    return Vehicle.builder()
        .id(id)
        .maximumLoad(maximumLoad)
        .colour(colour)
        .model(model)
        .build();
  }
}
