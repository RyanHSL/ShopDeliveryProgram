/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Shop.java
 * Description: A class that stored the customer orders and notify the available drivers all updates regarding the order.
 */

package edu.bu.met.cs665.model;

import edu.bu.met.cs665.bo.FastOption;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shop {

    private List<Driver> fastDriverList;
    private List<Driver> regularDriverList;
    private List<Driver> slowDriverList;
    private List<ShopOrder> orderList;

    public Shop() {
        fastDriverList = new ArrayList<>();
        regularDriverList = new ArrayList<>();
        slowDriverList = new ArrayList<>();
        orderList = new ArrayList<ShopOrder>();
    }

    public Shop(List<Driver> fastDriverList, List<Driver> regularDriverList, List<Driver> slowDriverList, List<ShopOrder> orderList) {
        this.fastDriverList = fastDriverList;
        this.regularDriverList = regularDriverList;
        this.slowDriverList = slowDriverList;
        this.orderList = orderList;
    }

    public List<Driver> getFastDriverList() {
        return fastDriverList;
    }

    public void setFastDriverList(List<Driver> fastDriverList) {
        this.fastDriverList = fastDriverList;
    }

    public List<Driver> getRegularDriverList() {
        return regularDriverList;
    }

    public void setRegularDriverList(List<Driver> regularDriverList) {
        this.regularDriverList = regularDriverList;
    }

    public List<Driver> getSlowDriverList() {
        return slowDriverList;
    }

    public void setSlowDriverList(List<Driver> slowDriverList) {
        this.slowDriverList = slowDriverList;
    }

    public List<ShopOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ShopOrder> orderList) {
        this.orderList = orderList;
    }

    public List<Driver> getAllDrivers() {
        List<Driver> drivers = new ArrayList<>();
        drivers.addAll(fastDriverList);
        drivers.addAll(regularDriverList);
        drivers.addAll(slowDriverList);

        return drivers;
    }
}
