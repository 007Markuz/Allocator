package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Vehicle {
  String id;
  String model;
  String Colour;
  int maximumLoad;
  int year;

}
