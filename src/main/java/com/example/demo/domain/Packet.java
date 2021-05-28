package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Packet {
  String id;
  int weight;
  boolean isFragile;
  int cubicCentimeter;
}
