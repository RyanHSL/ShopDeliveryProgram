/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: TestShop.java
 * Description: This file tests the public methods of Shop class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class TestShop {

    public TestShop() {}

    @Test
    public void testGetFastDriverList() {
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
        assertEquals(fastDriverList, shop.getFastDriverList());
    }

    @Test
    public void testSetFastDriverList() {
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
        Shop shop = new Shop();
        shop.setFastDriverList(fastDriverList);
        assertEquals(fastDriverList, shop.getFastDriverList());
    }

    @Test
    public void testGetRegularDriverList() {
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
        assertEquals(regularDriverList, shop.getRegularDriverList());
    }

    @Test
    public void testSetRegularDriverList() {
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
        Shop shop = new Shop();
        shop.setRegularDriverList(regularDriverList);
        assertEquals(regularDriverList, shop.getRegularDriverList());
    }

    @Test
    public void testGetSlowDriverList() {
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
        assertEquals(slowDriverList, shop.getSlowDriverList());
    }

    @Test
    public void testSetSlowDriverList() {
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
        Shop shop = new Shop();
        shop.setSlowDriverList(slowDriverList);
        assertEquals(slowDriverList, shop.getSlowDriverList());
    }

    @Test
    public void testGetOrderList() {
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
        assertEquals(orderList, shop.getOrderList());
    }

    @Test
    public void testSetOrderList() {
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
        Shop shop = new Shop();
        shop.setOrderList(orderList);
        assertEquals(orderList, shop.getOrderList());
    }
}
