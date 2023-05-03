/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Driver.java
 * Description: A parent class of each vehicle driver class which contains the capacity and the order list variables.
 * It enables to the driver to get the order updates from the shop and to accept and to deliver the order.
 */

package edu.bu.met.cs665.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Driver {

    private Integer speed;

    private Boolean available;

    private ShopOrder shopOrder;

    public Driver() {this.available = true;}
    public Driver(Boolean available, ShopOrder shopOrder) {
        this.available = available;
        this.shopOrder = shopOrder;
    }
    public Driver(Integer speed, Boolean available, ShopOrder shopOrder) {
        this.speed = speed;
        this.available = available;
        this.shopOrder = shopOrder;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public ShopOrder getShopOrder() {
        return shopOrder;
    }

    public void setShopOrder(ShopOrder shopOrder) {
        this.shopOrder = shopOrder;
    }
}
