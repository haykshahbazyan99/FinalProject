package com.shahbazyan.FinalProject.controller;

import com.shahbazyan.FinalProject.model.Car;
import com.shahbazyan.FinalProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    private CarService carService;


    @PostMapping("/addCar")
    public void addCar(@RequestBody Car car) {
        carService.saveCar(car);
    }


    @GetMapping("/getCar/{id}")
    public Car getCar(@PathVariable("id") int id) {
        return carService.getCar(id);
    }


    @DeleteMapping("/removeCar/{id}")
    public void removeCar(@PathVariable("id") int id) {

        Car car = carService.getCar(id);
        carService.deleteCar(car);
    }


    @PutMapping("/update/{id}")
    public void update(@RequestBody Car car,
                       @PathVariable("id") int id) {

        Car car1 = carService.getCar(id);

        car1.setModel(car.getModel());
        car1.setBrand(car.getBrand());
        car1.setColor(car.getColor());

        carService.updateCar(car1);
    }

}
