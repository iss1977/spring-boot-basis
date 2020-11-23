package com.springbeans.exemple.beansexemple.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneVehicleService implements VehicleService{

    private final Logger log = LoggerFactory.getLogger(PlaneVehicleService.class);

    @Override
    public void startEngine() {
        log.info("Starting the plane ...");
    }

    @Override
    public void move() {
        log.info("Flying the plane ...");
    }

    @Override
    public void stopEngine() {
        log.info("Crashing the plane ...");
    }
}
