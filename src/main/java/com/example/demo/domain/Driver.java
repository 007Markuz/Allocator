package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Driver {
  String id;
  String name;
  String lastName;
  TypeVehicle license;
}
