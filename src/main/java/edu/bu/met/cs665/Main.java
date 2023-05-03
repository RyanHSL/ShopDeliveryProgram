package edu.bu.met.cs665;

import edu.bu.met.cs665.controller.CustomerController;
import edu.bu.met.cs665.controller.DeliveryController;
import edu.bu.met.cs665.controller.DriverController;
import edu.bu.met.cs665.controller.ShopController;
import edu.bu.met.cs665.model.*;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

//  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();
    m.doIt();

//    logger.info(m.doIt());

//    logger.trace("Trace Message!");
//    logger.debug("Debug Message!");
//    logger.info("Info Message!");
//    logger.warn("Warn Message!");
//    logger.error("Error Message!");
//    logger.fatal("Fatal Message!");

  }



  private String doIt() {
    String result = "";
    Customer customer = new Customer("John", "Doe");
    ShopOrder order1 = new ShopOrder("Milk");
    ShopOrder order2 = new ShopOrder("Egg");
    ShopOrder order3 = new ShopOrder("Bread");
    Shop shop = new Shop();
    ShopController shopController = new ShopController(shop);
    shopController = shopController.addOrder(order1).addOrder(order2).addOrder(order3);
    Driver regularDriver1 = new VanDriver();
    Driver regularDriver2 = new VanDriver();
    Driver regularDriver3 = new VanDriver();
    Driver fastDriver1 = new TaxiDriver();
    Driver fastDriver2 = new TaxiDriver();
    Driver fastDriver3 = new TaxiDriver();
    Driver slowDriver1 = new ScooterDriver();
    Driver slowDriver2 = new ScooterDriver();
    Driver slowDriver3 = new ScooterDriver();
    shopController = shopController.addDriver(regularDriver1).addDriver(regularDriver2).addDriver(regularDriver3)
            .addDriver(fastDriver1).addDriver(fastDriver2).addDriver(fastDriver3).addDriver(slowDriver1)
            .addDriver(slowDriver2).addDriver(slowDriver3);
    CustomerController customerController = new CustomerController(customer, shop);


    try {
      while (true) {
        Boolean delivered = false;
        List<ShopOrder> orderList = shop.getOrderList();
        System.out.println("Please select the item that you would like to buy or enter 'Exit' to exit. We have milk, egg and bread.");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        ShopOrder order = null;
        for (ShopOrder so : shop.getOrderList()) {
          if (so.getName().equalsIgnoreCase(str)) {
            order = so;
          }
        }
        while (order != null) {
          System.out.println("Please select the delivery speed or enter 'Go back' to go to the previous session or " +
                  "enter 'Exit' to exit. Please enter 'Fast' or 'Regular' or 'Slow'.");
          input = new Scanner(System.in);
          str = input.nextLine();
          if (str.equalsIgnoreCase("Go back")) {
            break;
          }
          if (shopController.chooseDriver(str) != null) {
            Driver selectedDriver = customerController.chooseDriver(str);
            selectedDriver.setShopOrder(order);
            DeliveryController deliveryController = new DeliveryController(customer, selectedDriver, shop);
            while (!DeliveryController.getDriver().getAvailable()) {
              deliveryController.deliver();
//              System.out.println("Would you like to place another order?");
            }
            delivered = true;
            break;
          }
          else if (str.equalsIgnoreCase("Exit")) {
            System.out.println("Exiting.");
            break;
          }
          else {
            System.out.println("We currently do not have the available driver matching your selection. Please re-select.");
          }
        }
        if (str.equalsIgnoreCase("Exit")) {
          System.out.println("Exiting.");
          break;
        }
        else if (!str.equalsIgnoreCase("Go back") && !delivered){
          System.out.println("Sorry we do not have the item you requested. Please re-select the available option.");
        }
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }

    return result;
  }

}
