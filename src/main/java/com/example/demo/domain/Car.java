package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Car {

  String model;
  String Colour;
  String maximumLoad;

}
