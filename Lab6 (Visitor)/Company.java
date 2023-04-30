package lab6_visitor;

public class Company implements Element {
	   Element[] departments;
	   public Company(){
	      departments = new Element[] {new Administration(0, null, null, 0), new Development(0, null, null, 0), new Marketing(0, null, null, 0)};		
	   } 

	   public void accept(Visitor visitor) {
	      for (int i = 0; i < departments.length; i++) {
	         departments[i].accept(visitor);
	      }
	      visitor.visit(this);
	   }
	}