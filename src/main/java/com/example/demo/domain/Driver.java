package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@Entity
public class Driver {
  @Id
  @GeneratedValue
  int id;
  String name;
  String lastName;
  TypeVehicle license;
}
