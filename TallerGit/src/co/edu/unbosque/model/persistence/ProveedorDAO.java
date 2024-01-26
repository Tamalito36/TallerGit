package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ProveedorDTO;

public class ProveedorDAO implements CRUDOperation{
	
	private ArrayList<ProveedorDTO> proveedores;
	
	public ProveedorDAO() {
		// TODO Auto-generated constructor stub
		proveedores = new ArrayList<ProveedorDTO>();
	}

	@Override
	public void create(String... args) {
		
		proveedores.add(new ProveedorDTO(Integer.parseInt(args[0]), args[1]));
		
	}

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		String salida = "";
		
		for (ProveedorDTO p : proveedores) {
			
			salida += p.toString();
			
		}
		return salida;
	}

	@Override
	public boolean updateByIndex(int index, String... args) {
		
		if (index <0 || index >= proveedores.size()) {
			return false;
		}else {
			
			proveedores.get(index).setDocumento(Integer.parseInt(args[0]));
			proveedores.get(index).setNombre(args[1]);
			
		
			return true;
		}
	}

	@Override
	public boolean deleteByIndex(int index) {
		// TODO Auto-generated method stub
		if (index <0 || index >= proveedores.size()) {
			return false;
		}else {
			
			proveedores.remove(index);
		
			return true;
		}
	}

}
