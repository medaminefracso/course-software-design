package finalassignment;

import finalassignment.pizzamaking.Pizza;
import finalassignment.pizzamaking.PizzaSize;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .size(PizzaSize.MEDIUM)
                .cheese(true)
                .olives(false)
                .ham(true)
                .mushrooms(true)
                .pineapple(true)
                .build();

        System.out.println(pizza);
    }
}
