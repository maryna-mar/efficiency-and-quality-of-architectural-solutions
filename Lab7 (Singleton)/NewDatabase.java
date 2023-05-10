package lab7_singleton;

class NewDatabase {
	   private static NewDatabase baseObject;

	   private NewDatabase() {      
	   }

	   public static NewDatabase getAccess() {
	      if(baseObject == null) {
	         baseObject = new NewDatabase();
	      }
	       return baseObject;
	   }

	   public void getNotification() {
	       System.out.println("You have connected to a new database.");
	   }
}