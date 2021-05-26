package com.example.demo.service;

import com.example.demo.domain.Driver;
import com.example.demo.domain.Vehicle;
import java.util.List;
import java.util.Optional;

public interface DriverService {
  public List<Driver> getAll();

  public Optional<Driver> getById(Integer id);

  public boolean save(Driver driver);
}
