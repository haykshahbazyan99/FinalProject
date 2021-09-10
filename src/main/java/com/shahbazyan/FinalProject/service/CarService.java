package com.shahbazyan.FinalProject.service;

import com.shahbazyan.FinalProject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional
public class CarService {

    @Autowired
    private EntityManager entityManager;


    public void saveCar(Car car) {
        entityManager.persist(car);
    }


    public Car getCar(int id) {
        return entityManager.find(Car.class, id);
    }


    public void deleteCar(Car car) {
        entityManager.remove(car);
    }

    public void updateCar(Car car) {

        entityManager.merge(car);
    }

}
