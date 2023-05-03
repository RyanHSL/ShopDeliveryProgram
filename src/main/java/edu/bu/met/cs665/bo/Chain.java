package edu.bu.met.cs665.bo;

import edu.bu.met.cs665.model.Driver;
import edu.bu.met.cs665.model.Shop;

public class Chain {

    DeliveryOption chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new FastOption(new RegularOption(new SlowOption(null)));
    }

    public Driver findDriver(Shop shop, String speed) {
        return chain.findDriver(shop, speed);
    }

}
