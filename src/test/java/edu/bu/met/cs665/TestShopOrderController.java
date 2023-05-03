package edu.bu.met.cs665;

import edu.bu.met.cs665.controller.ShopOrderController;
import edu.bu.met.cs665.model.ShopOrder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShopOrderController {

    public void TestShopOrderController() {}

    @Test
    public void testDeliverOrder() {
        ShopOrder shopOrder = new ShopOrder("Milk");
        ShopOrderController shopOrderController = new ShopOrderController(shopOrder);
        shopOrderController.deliverOrder();

        assertEquals(true, shopOrderController.getShopOrder().getDelivered());
    }

    @Test
    public void testGetShopOrder() {
        ShopOrder shopOrder = new ShopOrder("Milk");
        ShopOrderController shopOrderController = new ShopOrderController(shopOrder);

        assertEquals(shopOrder, shopOrderController.getShopOrder());
    }
}
