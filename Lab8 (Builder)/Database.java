package lab8_builder;

public class Database {
	public String select;
	public String where;
	public int limit;
	public String get;
	
	public String toString() {
		return "select: " + select + "\nwhere: " + where + "\nlimit: " + limit + "\ngetSQL: " + get;
	}
}
