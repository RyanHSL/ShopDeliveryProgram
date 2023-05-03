package edu.bu.met.cs665.controller;

import edu.bu.met.cs665.model.Driver;

public class DriverController {

    private Driver driver;

    private CustomerController customerController;

    public DriverController(Driver driver) {
        this.driver = driver;
    }

    public void deliver(Driver driver) {
        if (driver.getSpeed() > 0) {
            Integer stops = driver.getSpeed();
            stops--;
            driver.setSpeed(stops);
        }
    }

    public Integer getStops() {
        return driver.getSpeed();
    }

    public Driver getDriver() {
        return driver;
    }

}
