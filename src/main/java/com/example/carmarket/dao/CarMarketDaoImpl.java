package com.example.carmarket.dao;

import com.example.carmarket.model.Car;
import org.apache.naming.factory.MailSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarMarketDaoImpl implements CarMarketDao {

    private static final Logger logger = LoggerFactory.getLogger(CarMarketDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }



    @Override
    public void addCar(Car car) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(car);
        logger.info("Car successfully saved. Car datails: " + car);

    }

    @Override
    public void updateCar(Car car) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(car);
        logger.info("Car successfully updated. Car details: "+ car);

    }

    @Override
    public void removeCar(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Car car = (Car) session.load(Car.class, new Integer(id));
        if (car!=null) {
            session.delete(car);
        }
        logger.info("Car successfully removed.Car details: "+ car);
    }

    @Override
    public Car getCarById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Car car = (Car) session.load(Car.class,new Integer(id));
        logger.info("Car successfully loaded. Car details: " + car);
        return car;
    }

    @Override
    public List<Car> listCars() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Car> cars = session.createQuery("from cars_in_stock").list();
        for(Car car:cars) {
            logger.info("Cars list: " + car);
        }
        return cars;
    }
}
