package com.example.carmarket.dao;

import com.example.carmarket.model.Car;

import java.util.List;

public interface CarMarketDao{
    public void addCar(Car car);
    public void updateCar(Car car);
    public void removeCar(int id);
    public Car getCarById(int id);
    public List<Car> listCars();

}
