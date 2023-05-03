/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: TestShopOrder.java
 * Description: This file tests the public methods of ShopOrder class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.model.ShopOrder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShopOrder {

    public TestShopOrder() {}

    @Test
    public void testGetName() {
        ShopOrder order = new ShopOrder("Milk");
        assertEquals("Milk", order.getName());
    }

    @Test
    public void testSetName() {
        ShopOrder order = new ShopOrder("Milk");
        order.setName("Egg");
        assertEquals("Egg", order.getName());
    }


    @Test
    public void testSetDelivered() {
        ShopOrder order = new ShopOrder("Milk");
        order.setDelivered(true);
        assertEquals(true, order.getDelivered());
    }
}
