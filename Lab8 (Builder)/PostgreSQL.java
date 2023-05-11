package lab8_builder;

public class PostgreSQL implements Builder {
	private Database _database = new Database();

	public void selectObject(String select) {
		_database.select = select;
	}
	
	public void whereObject(String where) {
		_database.where = where;
	}
	
	public void limitObject(int limit) {
		_database.limit = limit;
	}
	
	public void getObject(String get) {
		_database.get = get;
	}
	
	public Database getAccess() {
		return _database;
	}
}
