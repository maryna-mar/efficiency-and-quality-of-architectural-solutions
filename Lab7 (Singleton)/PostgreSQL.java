package lab7_singleton;

class PostgreSQL {
	   private static PostgreSQL baseObject;

	   private PostgreSQL() {      
	   }

	   public static PostgreSQL getAccess() {
	      if(baseObject == null) {
	         baseObject = new PostgreSQL();
	      }
	       return baseObject;
	   }

	   public void getNotification() {
	       System.out.println("You have connected to the PostgreSQL.");
	   }
}
