package com.gmail.aleksandrphilimonov.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanFromClass")
public class Car {
    @Autowired
    private CarEngine carEngine;

    @Value("${car.manufacturer}")
    private String manufacturer;

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public Car() {
    }

    public void getEngineModel() {
        System.out.println(carEngine.getEngineType());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
