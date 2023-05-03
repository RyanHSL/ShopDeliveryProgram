package edu.bu.met.cs665;

import edu.bu.met.cs665.controller.DriverController;
import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.TaxiDriver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDriverController {

    public void TestDriverController() {}

    @Test
    public void testDeliver() {
        Driver driver = new TaxiDriver();
        DriverController driverController = new DriverController(driver);

        driverController.deliver(driver);
        assertEquals(Integer.valueOf(0), driverController.getDriver().getSpeed());
    }

    @Test
    public void testGetStops() {
        Driver driver = new TaxiDriver();
        DriverController driverController = new DriverController(driver);

        assertEquals(Integer.valueOf(1), driverController.getStops());
    }

    @Test
    public void testGetDriver() {
        Driver driver = new TaxiDriver();
        DriverController driverController = new DriverController(driver);

        assertEquals(driver, driverController.getDriver());
    }
}
