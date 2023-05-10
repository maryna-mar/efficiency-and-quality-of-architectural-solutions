package lab7_singleton;

import java.util.Scanner;

class Application {
	public static void main(String[] args) {
	      PostgreSQL db1;
	      MongoDB db2;
	      NewDatabase new_db;
	      
	      db1 = PostgreSQL.getAccess();
	      db1.getNotification();
	      db2 = MongoDB.getAccess();
	      db2.getNotification();
	      
	      System.out.println("\nPlease enter a new database.");
	      try (Scanner in = new Scanner(System.in)) {
	  		String s = in.nextLine();
	  		System.out.println("Your database is: " + s + ".");
	  	  new_db = NewDatabase.getAccess();
		  new_db.getNotification();
	   }
	}
}