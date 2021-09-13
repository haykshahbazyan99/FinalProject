package com.shahbazyan.finalProject.controller;

import com.shahbazyan.finalProject.dto.CarDto;
import com.shahbazyan.finalProject.model.Car;
import com.shahbazyan.finalProject.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {

//    @Autowired
    private final CarService carService;

//    public CarController(CarService carService) {
//        this.carService = carService;
//    }

    @PostMapping("/createCar")
    public void createCar(@RequestBody CarDto carDto) {

        Car car = new Car();

        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setColor(carDto.getColor());

        carService.saveCar(car);
    }


    @GetMapping("/getCar/{id}")
    public CarDto getCar(@PathVariable("id") int id) {

        Car car = carService.getCar(id);
        return new CarDto(car);
    }


    @DeleteMapping("/removeCar/{id}")
    public void removeCar(@PathVariable("id") int id) {
        carService.deleteCar(id);
    }


    @PutMapping("/updateCar/{id}")
    public void updateCar(@RequestBody CarDto carDto,
                       @PathVariable("id") int id) {

        Car car = carService.getCar(id);

        car.setModel(carDto.getModel());
        car.setBrand(carDto.getBrand());
        car.setColor(carDto.getColor());

        carService.updateCar(car);

    }

}
