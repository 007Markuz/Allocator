package com.example.demo.domain;

public enum TypeVehicle {
  CAR("car",1),TRUCK("truck",2),MOTORCYCLE("motorcycle",3);

  String name;
  int id;

  TypeVehicle(String name, int id) {
    this.id= id;
    this.name=name;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

}
