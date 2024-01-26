package co.edu.unbosque.model.persistence;

public interface CRUDOperation {
	public void create(String... data);

	public void create(Object o);

	public String readAll();

	public boolean updateByIndex(int index, String... newData);

	public boolean deleteByIndex(int index);

}
