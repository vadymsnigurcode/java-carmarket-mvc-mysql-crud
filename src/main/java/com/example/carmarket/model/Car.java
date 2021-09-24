package com.example.carmarket.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CARS_IN_STOCK")
public class Car {
    @Getter
    @Setter
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int Id;

    @Setter
    @Getter
    @Column(name = "PRICE")
    public double price;

    @Getter
    @Setter
    @Column(name = "NAME")
    public String name;

    @Getter
    @Setter
    @Column(name = "BRAND")
    public String brand;
}
