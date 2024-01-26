package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.AspiranteDTO;

public class AspiranteDAO implements CrudOperation {

	private ArrayList<AspiranteDTO> listaAspirantes;

	@Override
	public void create(String... attribs) {
		AspiranteDTO aspirante = new AspiranteDTO();
		aspirante.setNombre(attribs[0]);
		aspirante.setDocumento(Integer.parseInt(attribs[1]));
		listaAspirantes.add(aspirante);
	}

	@Override
	public void create(Object obj) {
		listaAspirantes.add((AspiranteDTO) obj);

	}

	int index = 0;

	@Override
	public String readAll() {
		StringBuilder sb = new StringBuilder();
		index = 0;
		for (AspiranteDTO a : listaAspirantes) {
			sb.append(index + " -> " + a.toString());
			index++;
		}

		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, Object obj) {
		if (index >= listaAspirantes.size() || index < 0) {
			return false;
		} else {

			AspiranteDTO aux = (AspiranteDTO) obj;

			listaAspirantes.get(index).setNombre(aux.getNombre());
			listaAspirantes.get(index).setDocumento(aux.getDocumento());
			;

			return true;
		}
	}

	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaAspirantes.size()) {
			return false;
		} else {
			listaAspirantes.remove(index);

			return true;
		}
	}

	@Override
	public boolean delete(Object obj) {
		AspiranteDTO toDelete = (AspiranteDTO) obj;
		if (listaAspirantes.contains(toDelete)) {
			listaAspirantes.remove(index);
			return true;
		} else {
			return false;
		}
	}

}
