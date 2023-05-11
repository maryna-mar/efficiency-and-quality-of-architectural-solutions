package lab8_builder;

public interface Builder {	
	public abstract void selectObject(String select);
	public abstract void whereObject(String where);
	public abstract void limitObject(int limit);
	public abstract void getObject(String get);
	public abstract Database getAccess();
}
