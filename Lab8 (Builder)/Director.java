package lab8_builder;

public class Director {
	public void connectDatabase(Builder builder) {
		builder.selectObject("True");
		builder.whereObject("True");
		builder.limitObject(1);
		builder.getObject("True");
	}
}
