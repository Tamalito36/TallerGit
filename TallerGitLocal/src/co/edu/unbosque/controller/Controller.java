package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.EmpleadoDAO;
import co.edu.unbosque.model.EmpleadoDTO;
import co.edu.unbosque.model.persistence.AspiranteDAO;
import co.edu.unbosque.model.AspiranteDTO;
import co.edu.unbosque.model.persistence.ProveedorDAO;
import co.edu.unbosque.model.ProveedorDTO;
import co.edu.unbosque.view.Console;

public class Controller {
	private EmpleadoDAO eDao;
	private AspiranteDAO aDao;
	private ProveedorDAO pDao;
	private Console con;

	public Controller() {
		eDao = new EmpleadoDAO();
		aDao = new AspiranteDAO();
		pDao = new ProveedorDAO();
		con = new Console();
	}

	public void run() {
		cicloprincipal: while (true) {
			con.imprimirConSalto("BIENVENIDO A NUESTRA EMPRESA");
			con.imprimirConSalto("A que modulo desea ingresar?");
			con.imprimirConSalto("1. Modulo de creacion de usuarios ");
			con.imprimirConSalto("2. Modulo de proveedores ");
			con.imprimirConSalto("2. Modulo de contratadores");
			int num = con.leerEntero();

			con.quemarLinea();

			if (num == 1) {
				cicloAspirante: while (true) {
					con.imprimirConSalto("MENU PARA ASPIRANTE:");
					con.imprimirConSalto("1. Crear Aspirante ");
					con.imprimirConSalto("2. Eliminar Aspirante ");
					con.imprimirConSalto("3. Actualizar Aspirante ");
					con.imprimirConSalto("4. Mostrar Aspirante (por index)");
					con.imprimirConSalto("5. Salir ");
					int opc = con.leerEntero();
					con.quemarLinea();

					switch (opc) {
					case 1: {
						con.imprimirConSalto("Cual es el nombre del Aspirante?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Aspirante?");
						int documento = con.leerEntero();

						con.quemarLinea();

						aDao.create(new AspiranteDTO(name, documento));

						break;
					}
					case 2: {
						con.imprimirConSalto("Inserte la posicion del Aspirante que desea eliminar");
						int index = con.leerEntero();
						aDao.deleteByIndex(index);
						break;
					}
					case 3: {

						con.imprimirConSalto("Inserte la posicion del Aspirante que desea actualizar");
						int index = con.leerEntero();
						con.quemarLinea();

						con.imprimirConSalto("Cual es el nombre del Aspirante?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Aspirante?");
						int documento = con.leerEntero();

						con.quemarLinea();

						aDao.updateByIndex(index, name, Integer.toString(documento));

						break;
					}
					case 4: {
						con.imprimirConSalto(aDao.readAll());
						break;
					}
					case 5: {

						con.imprimirConSalto("HASTA LUEGO");
						break cicloAspirante;

					}
					default:
						con.imprimirConSalto("OPCION NO VALIDA");
						break;
					}
				}
			}
			if (num == 2) {
				cicloProveedor: while (true) {
					con.imprimirConSalto("MENU PARA PROVEEDOR:");
					con.imprimirConSalto("1. Crear Proveedor ");
					con.imprimirConSalto("2. Eliminar Proveedor ");
					con.imprimirConSalto("3. Actualizar Proveedor ");
					con.imprimirConSalto("4. Mostrar Proveedor (por index)");
					con.imprimirConSalto("5. Salir ");
					int opc = con.leerEntero();
					con.quemarLinea();

					switch (opc) {
					case 1: {
						con.imprimirConSalto("Cual es el nombre del Proveedor?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Proveedor?");
						int documento = con.leerEntero();

						con.quemarLinea();

						pDao.create(Integer.toString(documento), name);

						break;
					}
					case 2: {
						con.imprimirConSalto("Inserte la posicion del Proveedor que desea eliminar");
						int index = con.leerEntero();
						pDao.deleteByIndex(index);
						break;
					}
					case 3: {
						con.imprimirConSalto("Inserte la posicion del Proveedor que desea actualizar");
						int index = con.leerEntero();
						con.quemarLinea();

						con.imprimirConSalto("Cual es el nombre del Proveedor?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Proveedor?");
						int documento = con.leerEntero();

						con.quemarLinea();

						pDao.updateByIndex(index, Integer.toString(documento), name);

						break;
					}
					case 4: {
						con.imprimirConSalto(pDao.readAll());
						break;
					}
					case 5: {

						con.imprimirConSalto("HASTA LUEGO");
						break cicloProveedor;

					}
					default:
						con.imprimirConSalto("OPCION NO VALIDA");
						break;
					}
				}
			}
			if (num == 3) {
				cicloEmpleado: while (true) {
					con.imprimirConSalto("MENU PARA PROVEEDOR:");
					con.imprimirConSalto("1. Crear Empleado ");
					con.imprimirConSalto("2. Eliminar Empleado ");
					con.imprimirConSalto("3. Actualizar Empleado ");
					con.imprimirConSalto("4. Mostrar Empleado (por index)");
					con.imprimirConSalto("5. Salir ");
					int opc = con.leerEntero();
					con.quemarLinea();

					switch (opc) {
					case 1: {
						con.imprimirConSalto("Cual es el nombre del Empleado?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Empleado?");
						int documento = con.leerEntero();

						con.quemarLinea();

						eDao.create(new EmpleadoDTO(name, documento));

						break;
					}
					case 2: {
						con.imprimirConSalto("Inserte la posicion del Empleado que desea eliminar");
						int index = con.leerEntero();
						eDao.deleteByIndex(index);
						break;
					}
					case 3: {

						con.imprimirConSalto("Inserte la posicion del Empleado que desea actualizar");
						int index = con.leerEntero();
						con.quemarLinea();

						con.imprimirConSalto("Cual es el nombre del Empleado?");
						String name = con.leerLineaEntera();

						con.imprimirConSalto("Cual es el documento de identidad del Empleado?");
						int documento = con.leerEntero();

						con.quemarLinea();

						eDao.updateByIndex(index, name, Integer.toString(documento));

						break;
					}
					case 4: {
						con.imprimirConSalto(eDao.readAll());
						break;
					}
					case 5: {

						con.imprimirConSalto("HASTA LUEGO");
						break cicloEmpleado;

					}
					default:
						con.imprimirConSalto("OPCION NO VALIDA");
						break;
					}
				}
			}

		}
	}

}

