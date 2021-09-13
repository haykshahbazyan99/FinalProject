package com.shahbazyan.finalProject.repository;

import com.shahbazyan.finalProject.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Integer> {

}
