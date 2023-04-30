package lab6_visitor;

public class Application {
	   public static void main(String[] args) {
		  System.out.println("Total company payroll:");
		  System.out.println("");
	      Element company1 = new Company();
	      company1.accept(new Payroll());
	      
	      System.out.println("");
	      System.out.println("\nDepartment payroll:");
	      System.out.println("");
	      System.out.println("Administration department:");
	      Element administration = new Administration(1, "Jones", "General Director", 150750);
	      administration.accept(new Payroll());
	      
	      System.out.println("Development department:");
	      Element development1 = new Development(1, "Smith", "Senior Java developer", 100230);
	      development1.accept(new Payroll());
	      Element development2 = new Development(2, "Brown", "UI/UX Designer", 95120);
	      development2.accept(new Payroll());
	      
	      System.out.println("Marketing department:");
	      Element marketing = new Marketing(1, "Williams", "Manager", 55130);
	      marketing.accept(new Payroll());
	   }
}