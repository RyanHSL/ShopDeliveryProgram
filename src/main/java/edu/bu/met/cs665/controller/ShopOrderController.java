package edu.bu.met.cs665.controller;

import edu.bu.met.cs665.model.ShopOrder;

public class ShopOrderController {

    private ShopOrder shopOrder;

    public ShopOrderController(ShopOrder shopOrder) {
        this.shopOrder = shopOrder;
    }

    public ShopOrder getShopOrder() {
        return shopOrder;
    }
    public void deliverOrder() {
        shopOrder.setDelivered(true);
    }
}
