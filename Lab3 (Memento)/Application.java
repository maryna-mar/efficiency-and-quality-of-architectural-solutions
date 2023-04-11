package lab3_memento;

import java.util.Scanner;

public class Application { 
    public static void main(String[] args) {  
    Caretaker caretaker = new Caretaker();
    
    System.out.println("User selected alerts and clicked the \"Apply\" button.");
    Alerts alert = new Alerts("Facebook, Instagram, Telegram, WhatsApp");
    alert.printAlert();
    caretaker.add(alert.createMemento());
     
    System.out.println("\nUser changed alerts and clicked the \"Apply\" button again.");
    alert.setAlert("Facebook");
    alert.printAlert();
    caretaker.add(alert.createMemento());
    
    try (Scanner in = new Scanner(System.in)) {
		System.out.println("\nUser clicked the \"Cancel\" button.");
		String s = in.nextLine();
		
		if (s.equals("Cancel")) {	
			System.out.println("Previous version has been restored."); 
			alert.restoreMemento(caretaker.set(0));
			alert.printAlert();
			}
		}
    }
}