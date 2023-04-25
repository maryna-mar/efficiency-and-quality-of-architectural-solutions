package lab4_strategy;

public class RestaurantService implements Strategy {

    public double delivery(double price) {
        double service = 75.00;
        double tip = 25.00;
        return price + service + tip;
    }
}