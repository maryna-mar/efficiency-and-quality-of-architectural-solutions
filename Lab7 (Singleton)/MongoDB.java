package lab7_singleton;

class MongoDB {
	   private static MongoDB baseObject;

	   private MongoDB() {      
	   }

	   public static MongoDB getAccess() {
	      if(baseObject == null) {
	         baseObject = new MongoDB();
	      }
	       return baseObject;
	   }

	   public void getNotification() {
	       System.out.println("You have connected to the MongoDB.");
	   }
}
