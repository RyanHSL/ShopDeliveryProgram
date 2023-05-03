/**
 * Name: Rui Mao
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/23/2023
 * File Name: TestCustomer.java
 * Description: This file tests the public methods of Customer class.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.model.Customer;
import edu.bu.met.cs665.model.ShopOrder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    public TestCustomer() {}

    @Test
    public void testAddOrder() {
        ShopOrder order = new ShopOrder("Milk");
        Customer customer = new Customer("John", "Doe");
        customer.addOrder(order);
        assertEquals(1, customer.getOrderList().size());
    }

    @Test
    public void testGetOrderList() {
        ShopOrder order = new ShopOrder("Milk");
        Customer customer = new Customer("John", "Doe");
        customer.addOrder(order);
        assertEquals(order, customer.getOrderList().get(customer.getOrderList().size() - 1));
    }
}
