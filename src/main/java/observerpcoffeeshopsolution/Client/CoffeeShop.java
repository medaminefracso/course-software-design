package observerpcoffeeshopsolution.Client;

import observerpcoffeeshopsolution.coffeeshop.CoffeeAttendent;
import observerpcoffeeshopsolution.customers.Customer;

public class CoffeeShop {

    public static void main(String[] args) {
        Customer robert = new Customer("Robert", "French Vanilla");
        Customer bill = new Customer("Bill", "Hot coffee");

        CoffeeAttendent coffeeAttendent = new CoffeeAttendent();
        coffeeAttendent.takeOrder(robert);
        coffeeAttendent.takeOrder(bill);

        // prepare drink
        coffeeAttendent.prepareDrink("French Vanilla");
        coffeeAttendent.prepareDrink("Hot Coffee");

        // order up...
        coffeeAttendent.callOutCompletedOrders();
    }
}
