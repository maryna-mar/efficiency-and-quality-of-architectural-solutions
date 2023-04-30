package lab6_visitor;

public class Marketing implements Element {
		private int id;
		private String name; 
		private String position;
	    private int salary;
	    
	    public Marketing(int id, String name, String position, int salary) {  
	        this.id = id;
	    	this.name = name;
	    	this.position = position;
	        this.salary = salary;  
	    }  
	    
	    public int getId() {
	        return id;  
	    }
	    
	    public String getName() {
	        return name;  
	    }  
	    
	    public String getPosition() {
	        return position;  
	    }
	    
	    public int getSalary() {  
	        return salary;  
	    }  
	
	   public void accept(Visitor visitor) {
	      visitor.visit(this);
	   }
	}
