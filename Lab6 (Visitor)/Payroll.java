package lab6_visitor;

public class Payroll implements Visitor {
	   public void visit(Company company) {
	   }

	   public void visit(Administration administration) {
	      if (administration.getId() == 0) {
		      System.out.println("Administration department:");
	    	  System.out.println("No salary data! Please, contact Accounting.");
	      }
	      else {
	    	  System.out.println(administration.getId() + " - " + administration.getName() + " - " + administration.getPosition() + " - " + administration.getSalary());

	      }
	   }

       public void visit(Development development) {
 	      if (development.getId() == 0) {
		      System.out.println("Development department:");
 	    	  System.out.println("No salary data! Please, contact Accounting.");
 	      }
 	      else {
 	    	  System.out.println(development.getId() + " - " + development.getName() + " - " + development.getPosition() + " - " + development.getSalary());

 	      }
 	   }
	   
       public void visit(Marketing marketing) {
 	      if (marketing.getId() == 0) {
		      System.out.println("Marketing department:");
 	    	  System.out.println("No salary data! Please, contact Accounting.");
 	      }
 	      else {
 	    	  System.out.println(marketing.getId() + " - " + marketing.getName() + " - " + marketing.getPosition() + " - " + marketing.getSalary());

 	      }
 	   }
}
	