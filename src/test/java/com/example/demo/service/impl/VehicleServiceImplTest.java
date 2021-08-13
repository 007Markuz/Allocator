package com.example.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.domain.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class VehicleServiceImplTest {

  @InjectMocks
  VehicleServiceImpl vehicleService;

  @Mock
  private VehicleRepository repository;

  @Test
  void getById() {
  }

  @Test
  void getAll() {
  }

  @Test
  void save() {

    Vehicle element = Vehicle.builder().build();

    vehicleService.save(element);
    Mockito.verify(this.repository).save(element);
  }

  @Test
  void saveError() {

    Vehicle element = Vehicle.builder().build();

    Mockito.when(repository.save(element)).thenThrow(new IllegalArgumentException("error"));

    assertThrows(
        IllegalArgumentException.class,
        () -> {
          vehicleService.save(element);
        });
  }

}