package com.example.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.example.demo.domain.Driver;
import com.example.demo.repository.DriverRepository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DriverServiceImplTest {

  @InjectMocks
  DriverServiceImpl driverService;

  @Mock
  DriverRepository repository;

  @Test
  void getAll() {
    when(repository.findAll()).thenReturn(List.of(new Driver()));

    List<Driver> result= this.driverService.getAll();

    assertEquals(1,result.size() );

  }
  @Test
  void getAllWhitEmptyResult() {
    when(repository.findAll()).thenReturn(List.of());

    List<Driver> result= this.driverService.getAll();

    assertEquals(0,result.size() );

  }



  @Test
  void getById() {


    //IllegalArgumentException –
    when(repository.findById(1)).thenReturn(Optional.empty());

    Optional<Driver> result= this.driverService.getById(1);
  }

  @Test
  void save() {
  }
}