/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: ShopOrder.java
 * Description: A class that contains all attributes including name and delivery status of an order.
 */

package edu.bu.met.cs665.model;

public class ShopOrder {

    private String name;
    private Boolean delivered;

    public ShopOrder(String name, Boolean delivered) {
        this.name = name;
        this.delivered = delivered;
    }

    public ShopOrder(String name) {
        this.name = name;
        this.delivered = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }
}
