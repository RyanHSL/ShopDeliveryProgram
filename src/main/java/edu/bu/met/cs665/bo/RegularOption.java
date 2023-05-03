package edu.bu.met.cs665.bo;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.Shop;
import edu.bu.met.cs665.model.VanDriver;

import java.util.List;

public class RegularOption extends DeliveryOption {

    public RegularOption(DeliveryOption nextOption) {
        super(nextOption);
    }

    @Override
    public Driver findDriver(Shop shop, String speed) {
        Driver driver = new VanDriver();

        if (shop != null) {
            if (speed.equalsIgnoreCase("regular")) {
                List<Driver> drivers = shop.getRegularDriverList();
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
