package lab1_iterator;

public class Interpreter {
	public static void main(String args[]){
	      Tourist tourist = new Tourist();
	      System.out.println("1. Tourist choice: ");
	      for(Iterator iter = tourist.getIterator(); iter.hasNext();){
	         String route1 = (String)iter.next();
	         System.out.println(route1);
	      } 	
	      GPS gps = new GPS();
	      System.out.println("\n");
	      System.out.println("2. GPS choice: ");
	      for(Iterator iter = gps.getIterator(); iter.hasNext();){
	         String route2 = (String)iter.next();
	         System.out.println(route2); 
	      } 	
	      Guide guide = new Guide();
	      System.out.println("\n");
	      System.out.println("2. Guide choice: ");
	      for(Iterator iter = guide.getIterator(); iter.hasNext();){
	         String route3 = (String)iter.next();
	         System.out.println(route3); 
	      } 	
	}
}
