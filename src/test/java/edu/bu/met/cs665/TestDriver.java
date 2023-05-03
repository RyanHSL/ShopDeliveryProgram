/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: TestDriver.java
 * Description: This file tests the public methods of Driver class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.ShopOrder;
import edu.bu.met.cs665.model.TaxiDriver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDriver {

    public TestDriver() {}


    @Test
    public void testGetSpeed() {
        Driver driver = new TaxiDriver();
        assertEquals(Integer.valueOf(1), driver.getSpeed());
    }

    @Test
    public void testSetSpeed() {
        Driver driver = new TaxiDriver();
        driver.setSpeed(2);
        assertEquals(Integer.valueOf(2), driver.getSpeed());
    }

    @Test
    public void testGetAvailable() {
        Driver driver = new TaxiDriver();
        assertEquals(true, driver.getAvailable());
    }

    @Test
    public void testSetAvailable() {
        Driver driver = new TaxiDriver();
        driver.setAvailable(false);
        assertEquals(false, driver.getAvailable());
    }

    @Test
    public void testGetShopOrder() {
        ShopOrder shopOrder = new ShopOrder("Milk", false);
        Driver driver = new TaxiDriver(false, shopOrder);
        assertEquals(shopOrder, driver.getShopOrder());
    }

    @Test
    public void testSetShopOrder() {
        ShopOrder shopOrder = new ShopOrder("Milk", false);
        Driver driver = new TaxiDriver();
        driver.setShopOrder(shopOrder);
        assertEquals(shopOrder, driver.getShopOrder());
    }
}
