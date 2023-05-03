package edu.bu.met.cs665.controller;

import edu.bu.met.cs665.bo.Chain;
import edu.bu.met.cs665.model.*;

import java.util.List;

public class ShopController {

    private Shop shop;
    private ShopOrderController shopOderController;

    public ShopController(Shop shop) {
        this.shop = shop;
    }

    public ShopController addDriver(Driver driver) {
        if (driver instanceof TaxiDriver) {
            List<Driver> driverList = shop.getFastDriverList();
            driverList.add(driver);
            shop.setFastDriverList(driverList);
        }
        else if (driver instanceof VanDriver) {
            List<Driver> driverList = shop.getRegularDriverList();
            driverList.add(driver);
            shop.setRegularDriverList(driverList);
        }
        else if (driver instanceof ScooterDriver) {
            List<Driver> driverList = shop.getSlowDriverList();
            driverList.add(driver);
            shop.setSlowDriverList(driverList);
        }

        return this;
    }

    public ShopController addOrder(ShopOrder order) {
        List<ShopOrder> orderList = shop.getOrderList();
        orderList.add(order);
        shop.setOrderList(orderList);
        return this;
    }

    public Driver chooseDriver(String speed) {
        Chain chain = new Chain();
        Driver driver = chain.findDriver(shop, speed);
        if (driver != null) {
            driver.setAvailable(false);
        }
        return driver;
    }

    public void deliverOrder(ShopOrder shopOrder) {
        ShopOrderController shopOrderController = new ShopOrderController(shopOrder);
        shopOrderController.deliverOrder();
    }
}
