package Practica7;

import java.nio.channels.Selector;
import java.util.Scanner;

public class AgendaAPP {

	public static void main(String[] args) {

		Agenda a1 = new Agenda();
		Scanner sc = new Scanner(System.in);

		int posicionEliminar = -1;
		int selector = 0;
		String nombre = "";
		String telefono = "";

		do {
			System.out.println("AGENDA TELEFÓNICA");
			System.out.println("*****************");
			System.out.println("1. Añadir nuevo contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Estado de la agenda");
			System.out.println("6. Salir");
			System.out.println();
			System.out.println("Elige una opción");
			try {
				selector = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {

			}

			switch (selector) {
			case 1: {
				System.out.println("1. Añadir nuevo contacto");
				System.out.print("Introduce el nombre del contacto: ");
				nombre = sc.nextLine();
				System.out.print("Introduce el número del contacto: ");
				telefono = sc.nextLine();
				a1.addContacto(new Contacto(nombre, telefono));
				nombre = "";
				telefono = "";
				break;
			}
			case 2: {
				System.out.println("2. Listar contactos");
				a1.listarContactos();
				break;
			}
			case 3: {
				System.out.println("3. Buscar contactos");
				System.out.print("Introduce el nombre a buscar");
				nombre = sc.nextLine();
				a1.buscarContacto(nombre);
				break;
			}
			case 4: {
				System.out.println("4. Eliminar contacto");
				System.out.println("Introduce la posición del contacto a eliminar (desde 0 hasta n): ");
				posicionEliminar = Integer.parseInt(sc.nextLine());
				a1.eliminarContacto(a1.obtenerContacto(posicionEliminar));
				System.out.println();
				break;
			}
			case 5: {
				System.out.println("5. estado de la agenda");
				a1.listarContactos();
				break;
			}

			case 6: {
				System.out.println("6. Salir");
			}

			}
		} while (selector != 6);

	}

}
