package co.edu.unbosque.model.persistence;

public interface CRUDOperation {
	
	public void create(String ...args);
	
	public String readAll();
	
	public boolean updateByIndex(int index, String...args);
	
	public boolean deleteByIndex(int index);

}
