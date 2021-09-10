package com.shahbazyan.FinalProject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="CARS")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String brand;
    private String model;
    private String color;


//    public Car(String brand, String model, String color) {
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//    }

}
