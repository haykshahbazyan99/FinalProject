package com.shahbazyan.finalProject.controller;

import com.shahbazyan.finalProject.model.Car;
import com.shahbazyan.finalProject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {

//    @Autowired
    private final CarService carService;


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
        carService.deleteCar(id);

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
