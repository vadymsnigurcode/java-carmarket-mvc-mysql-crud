package com.example.carmarket.service;

import com.example.carmarket.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {
    public void addCar(Car car);
    public void updateCar(Car car);
    public void removeCar(int id);
    public Car getCarById(int id);
    public List<Car> listCars();
}
