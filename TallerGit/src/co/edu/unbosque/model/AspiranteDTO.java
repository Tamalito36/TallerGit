package co.edu.unbosque.model;

public class AspiranteDTO {

	private String nombre;
	private int documento;
	
	public AspiranteDTO() {
		// TODO Auto-generated constructor stub
	}

	public AspiranteDTO(String nombre, int documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "AspiranteDTO [nombre=" + nombre + ", documento=" + documento + "]";
	}

	
	
}
