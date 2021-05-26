package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order {
  String id;
  Driver driver;
  String origin;
  String destination;
  Vehicle vehicle;
  Packet packet;
}
