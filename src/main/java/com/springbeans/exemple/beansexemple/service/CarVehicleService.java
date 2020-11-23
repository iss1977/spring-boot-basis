package com.springbeans.exemple.beansexemple.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarVehicleService implements VehicleService{

    private final Logger log = LoggerFactory.getLogger(CarVehicleService.class);

    @Override
    public void startEngine() {
        log.info("Starting the car ...");
    }

    @Override
    public void move() {
        log.info("Moving the car ...");
    }

    @Override
    public void stopEngine() {
        log.info("Stopping the car ...");
    }
}
