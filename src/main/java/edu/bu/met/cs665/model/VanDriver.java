/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: VanDriver.java
 * Description: A child class of the Driver class which has its own capacity.
 */

package edu.bu.met.cs665.model;

public class VanDriver extends Driver {

    private Integer speed;

    public VanDriver() {
        super();
        this.speed = 2;
    }
    public VanDriver(Boolean available, ShopOrder shopOrder) {
        super(available, shopOrder);
        this.speed = 2;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
