package edu.bu.met.cs665;

import edu.bu.met.cs665.controller.CustomerController;
import edu.bu.met.cs665.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCustomerController {

    public TestCustomerController() {}

    @Test
    public void testChooseDriver() {
        ShopOrder order1 = new ShopOrder("Milk");
        ShopOrder order2 = new ShopOrder("Egg");
        ShopOrder order3 = new ShopOrder("Bread");
        Driver regularDriver1 = new VanDriver();
        Driver regularDriver2 = new VanDriver();
        Driver regularDriver3 = new VanDriver();
        Driver fastDriver1 = new TaxiDriver();
        Driver fastDriver2 = new TaxiDriver();
        Driver fastDriver3 = new TaxiDriver();
        Driver slowDriver1 = new ScooterDriver();
        Driver slowDriver2 = new ScooterDriver();
        Driver slowDriver3 = new ScooterDriver();
        List<ShopOrder> orderList = new ArrayList<>();
        List<Driver> fastDriverList = new ArrayList<>();
        List<Driver> regularDriverList = new ArrayList<>();
        List<Driver> slowDriverList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        fastDriverList.add(fastDriver1);
        fastDriverList.add(fastDriver2);
        fastDriverList.add(fastDriver3);
        regularDriverList.add(regularDriver1);
        regularDriverList.add(regularDriver2);
        regularDriverList.add(regularDriver3);
        slowDriverList.add(slowDriver1);
        slowDriverList.add(slowDriver2);
        slowDriverList.add(slowDriver3);
        Shop shop = new Shop(fastDriverList, regularDriverList, slowDriverList, orderList);
        Customer customer = new Customer("John", "Doe");
        CustomerController customerController = new CustomerController(customer, shop);
        Driver driver = customerController.chooseDriver("fast");
        assertEquals(fastDriver1, driver);
    }
}
