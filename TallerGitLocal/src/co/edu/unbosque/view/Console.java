package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner lector;

	public Console() {
		lector = new Scanner(System.in);
	}

	public void imprimirConSalto(String data) {
		System.out.println(data);
	}

	public void imprimirSinSalto(String data) {
		System.out.print(data);
	}

	public int leerEntero() {
		return lector.nextInt();
	}

	public long leerLong() {
		return lector.nextLong();
	}

	public float leerFloat() {
		return lector.nextFloat();
	}

	public double leerDouble() {
		return lector.nextDouble();
	}

	public String leerLineaEntera() {
		return lector.nextLine();
	}

	public String leerPalabra() {
		return lector.next();
	}

	public boolean leerBoolean() {
		return lector.nextBoolean();
	}

	public void quemarLinea() {
		lector.nextLine();
	}

}

