package lab6_visitor;

public interface Visitor {
	public void visit(Company company);
	public void visit(Marketing marketing);
	public void visit(Administration administration);
	public void visit(Development development);
}