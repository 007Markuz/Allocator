package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
public class Vehicle {
  @Id
  @GeneratedValue
  int id;
  String model;
  String colour;
  @Column(name="maximumload")
  int maximumLoad;

}
