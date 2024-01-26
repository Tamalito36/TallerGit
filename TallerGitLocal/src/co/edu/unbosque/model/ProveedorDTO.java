package co.edu.unbosque.model;

public class ProveedorDTO {
	
	private int documento;
	private String nombre;
	
	public ProveedorDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProveedorDTO(int documento, String nombre) {
		super();
		this.documento = documento;
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ProveedorDTO [documento=" + documento + ", nombre=" + nombre + "]";
	}
	
	

}
