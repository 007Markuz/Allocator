package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Car {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  Integer Id;

  String model;
  String Colour;
  @Column(name="maximumload")
  String maximumLoad;

}
