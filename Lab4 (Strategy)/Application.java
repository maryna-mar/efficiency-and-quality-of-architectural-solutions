package lab4_strategy;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        double dish = 574.55;
        System.out.println("Your bill: " + dish);
        System.out.println("\nPlease, select a delivery type.");
        System.out.println("Pickup, Restaurant Service or Another Delivery Service?");
            
        try (Scanner in = new Scanner(System.in)) {
            Strategy strategy1 = new Pickup();
            String s = in.nextLine();
    		if (s.equals("Pickup")) {	
    			System.out.println("\nYou have selected Pickup."); 
    	        System.out.println("Bill with Pickup: " + strategy1.delivery(dish));
    			}
    		
    		Strategy strategy2 = new RestaurantService();
    		if (s.equals("Restaurant Service")) {	
    			System.out.println("\nYou have selected Restaurant Service."); 
    			System.out.println("Bill with Restaurant Service: " + strategy2.delivery(dish) + " (service + tip).");
    			}
    		
    	    Strategy strategy3 = new DeliveryService();
    		if (s.equals("Another Delivery Service")) {	
    			System.out.println("\nYou have selected Another Delivery Service."); 
    			System.out.println("Bill with Another Delivery Service: " + strategy3.delivery(dish) + " (service + tip + fee).");
    			}
    }
}}
