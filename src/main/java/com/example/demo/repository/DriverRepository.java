package com.example.demo.repository;

import com.example.demo.domain.Driver;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DriverRepository  extends CrudRepository<Driver, Integer> {


  @Query(value = "INSERT INTO db.driver (name, last_name, license ) VALUES (:name, :lastname, :license )",
      nativeQuery = true)
  public void saveDriver(@Param("name") String name,@Param("lastname") String lastname,@Param("license") int license);
}
