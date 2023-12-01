package observerpcoffeeshopsolution.customers;

public interface WaitingCustomer {

    void orderReady(String prepareDrink);

    public String getName();

    public String getDrinkOrdered();
}
