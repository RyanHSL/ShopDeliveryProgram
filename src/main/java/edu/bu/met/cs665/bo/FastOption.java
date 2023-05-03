package edu.bu.met.cs665.bo;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.Shop;
import edu.bu.met.cs665.model.TaxiDriver;

import java.util.List;

public class FastOption extends DeliveryOption {

    public FastOption(DeliveryOption nextOption) {
        super(nextOption);
    }

    @Override
    public Driver findDriver(Shop shop, String speed) {
        Driver driver = new TaxiDriver();

        if (shop != null) {
            if (speed.equalsIgnoreCase("fast")) {
                List<Driver> drivers = shop.getFastDriverList();
                for (Driver d : drivers) {
                    if (d.getAvailable()) {
                        driver = d;
                        break;
                    }
                }
            } else {
                driver = super.findDriver(shop, speed);
            }
        }

        return driver;
    }
}
