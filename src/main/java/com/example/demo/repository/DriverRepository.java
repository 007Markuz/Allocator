package com.example.demo.repository;

import com.example.demo.domain.Driver;
import com.example.demo.domain.Vehicle;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository  extends CrudRepository<Driver, Integer> {

  @Query("INSERT INTO db.driver " +
      "(last_name, license, name) " +
      "VALUES( :lastname, :license, :name)")
  public void save(String name,String lastname, int license);
}
