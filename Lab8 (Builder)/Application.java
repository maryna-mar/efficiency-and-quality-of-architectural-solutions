package lab8_builder;

public class Application {
	public static void main(String[] args) {		
		Builder postgre_builder = new PostgreSQL();
		Builder mysql_builder = new MySQL();
		
		Director director = new Director();
		director.connectDatabase(postgre_builder);
		director.connectDatabase(mysql_builder);
		
		System.out.println("PostgreSQL");
		Database database1 = postgre_builder.getAccess();
		System.out.println(database1.toString());
		
		System.out.println("\nMySQL");
		Database database2 = postgre_builder.getAccess();
		System.out.println(database2.toString());
	}
}
