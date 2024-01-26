package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.EmpleadoDTO;


public class EmpleadoDAO implements CRUDOperation {
	private ArrayList<EmpleadoDTO> listaEmpleados;

	public EmpleadoDAO() {
		listaEmpleados = new ArrayList<>();
	}

	@Override
	public void create(String... data) {
		EmpleadoDTO temp = new EmpleadoDTO();
		temp.setNombre(data[0]);
		temp.setDocumento(Integer.parseInt(data[1]));
		listaEmpleados.add(temp);
	}

	@Override
	public void create(Object o) {
		listaEmpleados.add((EmpleadoDTO) o);
	}

	int index = 0;

	@Override
	public String readAll() {
		index = 0;
		StringBuilder sb = new StringBuilder();
		listaEmpleados.forEach(empleado -> {
			sb.append(empleado.toString());
			index++;
		});
		return sb.toString();
	}

	@Override
	public boolean updateByIndex(int index, String... newData) {
		if (index < 0 || index >= listaEmpleados.size()) {
			return false;
		} else {
			if (!newData[0].isBlank() || !newData[0].isEmpty() || !newData[0].equals("")) {
				listaEmpleados.get(index).setNombre(newData[0]);
			}
			if (!newData[1].isBlank() || !newData[1].isEmpty() || !newData[1].equals("")) {
				listaEmpleados.get(index).setDocumento(Integer.parseInt(newData[1]));
			}
			return true;
		}
	}

	@Override
	public boolean deleteByIndex(int index) {
		if (index < 0 || index >= listaEmpleados.size()) {
			return false;
		} else {
			listaEmpleados.remove(index);
			return true;
		}
	}

	public ArrayList<EmpleadoDTO> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<EmpleadoDTO> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
