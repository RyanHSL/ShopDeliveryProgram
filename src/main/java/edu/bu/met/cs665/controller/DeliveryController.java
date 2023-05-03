package edu.bu.met.cs665.controller;

import edu.bu.met.cs665.model.*;

public class DeliveryController {

    private Customer customer;
    private static Driver driver;
    private Shop shop;

    private CustomerController customerController;
    private DriverController driverController;
    private ShopController shopController;

    public DeliveryController(Customer customer, Driver driver, Shop shop) {
        this.customer = customer;
        this.driver = driver;
        this.shop = shop;
        this.customerController = new CustomerController(customer, shop);
        this.driverController = new DriverController(driver);
        this.shopController = new ShopController(shop);
    }

    public void deliver() {
        if (!driver.getAvailable()) {
            if (driver.getSpeed() > 0) {
                driverController.deliver(driver);
                notifyCustomer();
            }
            else {
                shopController.deliverOrder(driver.getShopOrder());
                resetDriver();
            }
        }
    }

    public void notifyCustomer() {
        ShopOrder shopOrder = driver.getShopOrder();

        if (shopOrder != null) {
            if (driver.getSpeed() == 0) {
                StringBuilder str = new StringBuilder(customer.getFirstName() + customer.getLastName() + " your order " + shopOrder.getName() +
                        " has been delivered.");
                customerController.getNotification(str.toString());
                shopController.deliverOrder(shopOrder);
                resetDriver();
            } else {
                StringBuilder str = new StringBuilder(customer.getFirstName() + customer.getLastName() + " your order " + shopOrder.getName() +
                        " is " + driverController.getStops() + " stops away.");
                customerController.getNotification(str.toString());
            }
        }
    }

    public void resetDriver() {
        if (driver instanceof TaxiDriver) {
            driver = new TaxiDriver();
        }
        else if (driver instanceof VanDriver) {
            driver = new VanDriver();
        }
        else if (driver instanceof ScooterDriver) {
            driver = new ScooterDriver();
        }
    }

    public static Driver getDriver() {
        return driver;
    }

}
