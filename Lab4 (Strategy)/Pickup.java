package lab4_strategy;

public class Pickup implements Strategy {
	
    public double delivery(double price) {
        double service = 0.00;
        return price + service;
    }
}
