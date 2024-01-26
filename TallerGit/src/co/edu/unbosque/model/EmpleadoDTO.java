package co.edu.unbosque.model;

public class EmpleadoDTO {
	private String nombre;
	private int documento;
	
	public EmpleadoDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmpleadoDTO(String nombre, int documento) {
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
		return "Empleado"+"\n"+ "Nombre=" + nombre +"\n"+ "Documento=" + documento;
	}
	
	

}
