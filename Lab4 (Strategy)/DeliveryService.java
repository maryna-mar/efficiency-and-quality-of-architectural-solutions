package lab4_strategy;

public class DeliveryService implements Strategy {

    public double delivery(double price) {
        double service = 100.00;
        double tip = 25.00;
        double fee = 15.00;
        return price + service + tip + fee;
    }
}
