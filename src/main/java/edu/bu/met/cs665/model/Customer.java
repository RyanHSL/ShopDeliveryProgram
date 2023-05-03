/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: Customer.java
 * Description: A class which creates the initial user of the shop order system.
 */

package edu.bu.met.cs665.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{

    private List<ShopOrder> orderList = new ArrayList<ShopOrder>();

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void addOrder(ShopOrder order) {
        orderList.add(order);
    }

    public List<ShopOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ShopOrder> orderList) {this.orderList = orderList;}
}
