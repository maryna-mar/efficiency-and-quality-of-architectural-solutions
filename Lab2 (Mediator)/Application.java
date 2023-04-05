package lab2_mediator;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
        Mediator mediator_1 = new MediatorStruct();
        //Вибір дати доставки
        Notification cell_1 = new NotificationStruct(mediator_1, "Cell 1");
        Notification cell_2 = new NotificationStruct(mediator_1, "Cell 2");
        Notification date_1 = new NotificationStruct(mediator_1, "Date 1");
        Notification date_2 = new NotificationStruct(mediator_1, "Date 2");
        Notification date_3 = new NotificationStruct(mediator_1, "Date 3");
        
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("You have selected a date:");
			String s_1 = in.nextLine();

			if (s_1.equals("Cell 1")) {
				mediator_1.addNotification(cell_1);
				mediator_1.addNotification(date_1);
				cell_1.send("This date is available!");
			}
			
			if (s_1.equals("Cell 2")) {
				mediator_1.addNotification(cell_2);
				mediator_1.addNotification(date_2);
				mediator_1.addNotification(date_3);
				cell_2.send("This date is available!");
			}
			
			//Отримувач інша особа
			Mediator mediator_2 = new MediatorStruct();
			Notification another_person = new NotificationStruct(mediator_2, "Another person");
			Notification name = new NotificationStruct(mediator_2, "Name");
			Notification number = new NotificationStruct(mediator_2, "Number");
			System.out.println("Who will receive an order?");
			String s_2 = in.nextLine();
			
			if (s_2.equals("Another person")) {
				mediator_2.addNotification(name);
				mediator_2.addNotification(number);
				another_person.send("Another person option is selected!");
			}
			
			//Самовивіз
			Mediator mediator_3 = new MediatorStruct();
			Notification pickup = new NotificationStruct(mediator_3, "Pickup");
			System.out.println("Pickup or delivery?");
			String s_3 = in.nextLine();
			if (s_3.equals("Pickup")) {
				mediator_3.addNotification(name);
				mediator_3.addNotification(number);
				pickup.send("Deactivation.");
			}
		}
    }
}