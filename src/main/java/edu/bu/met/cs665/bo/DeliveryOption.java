package edu.bu.met.cs665.bo;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.Shop;

abstract class DeliveryOption {
    private DeliveryOption nextOption;

    public DeliveryOption(DeliveryOption nextOption) {
        this.nextOption = nextOption;
    }

    public Driver findDriver(Shop shop, String speed) {
        Driver driver = null;
        if (nextOption != null) {
            driver = nextOption.findDriver(shop, speed);
        }
        return driver;
    }

}
