package edu.bu.met.cs665.bo;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.ScooterDriver;
import edu.bu.met.cs665.model.Shop;

import java.util.List;

public class SlowOption extends DeliveryOption {

    public SlowOption(DeliveryOption nextOption) {
        super(nextOption);
    }

    @Override
    public Driver findDriver(Shop shop, String speed) {
        Driver driver = new ScooterDriver();

        if (shop != null) {
            if (speed.equalsIgnoreCase("slow")) {
                List<Driver> drivers = shop.getSlowDriverList();
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
