package com.shahbazyan.finalProject.dto;

import com.shahbazyan.finalProject.model.Car;
import lombok.Data;

@Data
public class CarDto {

    private int id;
    private String brand;
    private String model;
    private String color;


    public CarDto() {
    }


    public CarDto(Car car) {
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.color = car.getModel();

    }

}
