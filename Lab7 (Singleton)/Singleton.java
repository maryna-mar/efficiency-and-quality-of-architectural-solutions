package lab7_singleton;

class Singleton {
	   private static Singleton singleObject;
	                                              
	   private Singleton() {
	   }

	   public static Singleton get¿ccess() {
		return singleObject;
	   }
}
