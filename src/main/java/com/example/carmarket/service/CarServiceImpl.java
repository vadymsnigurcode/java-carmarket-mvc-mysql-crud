package com.example.carmarket.service;

import com.example.carmarket.dao.CarMarketDao;
import com.example.carmarket.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMarketDao carDao;
    public void setCarDao(CarMarketDao carDao) {
        this.carDao = carDao;
    }

    public CarMarketDao getCarDao() {
        return carDao;
    }



    @Override
    @Transactional
    public void addCar(Car car) {
        this.carDao.addCar(car);

    }

    @Override
    @Transactional
    public void updateCar(Car car) {
        this.carDao.updateCar(car);
    }

    @Override
    @Transactional
    public void removeCar(int id) {
        this.carDao.removeCar(id);
    }

    @Override
    @Transactional
    public Car getCarById(int id) {
        return this.carDao.getCarById(id);
    }

    @Override
    @Transactional
    public List<Car> listCars() {

        return this.carDao.listCars();
    }
}
