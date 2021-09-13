package com.shahbazyan.finalProject.service;

import com.shahbazyan.finalProject.model.Car;
import com.shahbazyan.finalProject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Component
public class CarService {


    @Autowired
    private CarRepository carRepository;


    public void saveCar(Car car) {
        carRepository.save(car);
    }


    public Car getCar(int id) {
        return carRepository.findById(id).orElseGet(null);
    }


    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }


    public void updateCar(Car car) {
        carRepository.save(car);
    }


}
