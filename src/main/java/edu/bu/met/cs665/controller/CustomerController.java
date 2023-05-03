package edu.bu.met.cs665.controller;

import edu.bu.met.cs665.model.Customer;
import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.Shop;

public class CustomerController {

    private Customer customer;
    private Shop shop;
    private ShopController shopController;

    public CustomerController(Customer customer, Shop shop) {
        this.customer = customer;
        this.shop = shop;
        this.shopController = new ShopController(shop);
    }

    public Driver chooseDriver(String speed) {
        Driver driver = shopController.chooseDriver(speed);
        return driver;
    }
    public void getNotification(String notification) {
        System.out.println(notification);
    }
}
