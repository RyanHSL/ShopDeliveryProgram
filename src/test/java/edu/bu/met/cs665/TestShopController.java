package edu.bu.met.cs665;

import edu.bu.met.cs665.controller.ShopController;
import edu.bu.met.cs665.model.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShopController {

    public TestShopController() {}

    @Test
    public void testAddDriver() {
        Shop shop = new Shop();
        ShopController shopController = new ShopController(shop);
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
        shopController = shopController.addDriver(regularDriver1);

        assertEquals(regularDriver1, shop.getRegularDriverList().get(0));
    }

    @Test
    public void testAddOrder() {
        Shop shop = new Shop();
        ShopController shopController = new ShopController(shop);
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
        shopController = shopController.addOrder(order1);

        assertEquals(order1, shop.getOrderList().get(0));
    }

    @Test
    public void testChooseDriver() {
        Shop shop = new Shop();
        ShopController shopController = new ShopController(shop);
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
        shopController = shopController.addOrder(order1).addOrder(order2).addOrder(order3);
        shopController = shopController.addDriver(regularDriver1).addDriver(regularDriver2).addDriver(regularDriver3)
                .addDriver(fastDriver1).addDriver(fastDriver2).addDriver(fastDriver3).addDriver(slowDriver1)
                .addDriver(slowDriver2).addDriver(slowDriver3);
        Driver driver = shopController.chooseDriver("fast");
        assertEquals(fastDriver1, driver);
    }

    @Test
    public void testDeliverOrder() {
        Shop shop = new Shop();
        ShopController shopController = new ShopController(shop);
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
        shopController = shopController.addOrder(order1).addOrder(order2).addOrder(order3);
        shopController = shopController.addDriver(regularDriver1).addDriver(regularDriver2).addDriver(regularDriver3)
                .addDriver(fastDriver1).addDriver(fastDriver2).addDriver(fastDriver3).addDriver(slowDriver1)
                .addDriver(slowDriver2).addDriver(slowDriver3);
        shopController.deliverOrder(order1);
        assertEquals(true, order1.getDelivered());
    }
}
