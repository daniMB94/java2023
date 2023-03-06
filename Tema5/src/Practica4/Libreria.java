package Practica4;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
	// MIEMBROS

	private ArrayList<Libro> libros;

	// CONSTRUCTOR
	public Libreria() {
		super();
		this.libros = new ArrayList<>(1000);
	}

	// GETTERS
	public Libro getLibros(int posicion) {

		return libros.get(posicion);

	}

	// METODOS
	public int tamañoArrayList() {
		return libros.size();
	}

	public double venderLibro(Libro lib) {
		Scanner sc = new Scanner(System.in);
		boolean error = true;

		if (!lib.isVendido()) {
			while (error == true) {
				try {
					System.out.println("Introduce precio de venta");
					lib.setPrecioVenta(Double.parseDouble(sc.nextLine()));
					if (lib.getPrecioVenta() < 0) {
						System.out.println("Solo se admiten precios positivos");
						error = true;
					} else
						error = false;
				} catch (Exception e) {
					System.out.println("Solo se admiten numeros");
					error = true;
				}
			}

			lib.setVendido(true);
			return lib.getPrecioVenta();
		} else
			return 0;
	}

	public double comprarLibro(Libro lib) {
		Scanner sc = new Scanner(System.in);
		boolean error = true;

		while (error == true) {
			try {
				System.out.println("Introduce el precio de compra del libro " + lib.getTitulo());
				lib.setPrecioCompra(Double.parseDouble(sc.nextLine()));
				if (lib.getPrecioCompra() < 0) {
					System.out.println("Solo se admiten precios positivos");
					error = true;
				} else
					error = false;
			} catch (Exception e) {
				System.out.println("Solo se admiten numeros");
				error = true;
			}

		}

		try {
			libros.add(lib);
			return lib.getPrecioCompra();
		} catch (Exception e) {
			System.out.println("La libreria está llena (hay 1000 libros");
			return 0;
		}

	}

	public double ganancias() {
		double ganancia = 0;
		for (Libro lib : this.libros) {
			if (lib.isVendido()) {
				ganancia = ganancia + (lib.getPrecioVenta() - lib.getPrecioCompra());
			} else
				ganancia = ganancia - lib.getPrecioCompra();
		}
		return ganancia;
	}
}
