package T7E3;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AgendaAPP {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		Scanner sc = new Scanner(System.in);

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
				agenda.addContacto(nombre, telefono);
				nombre = "";
				telefono = "";
				break;
			}
			case 2: {
				System.out.println("2. Listar contactos");
				System.out.println(agenda.listarContactos());
				break;
			}
			case 3: {
				System.out.println("3. Buscar contactos");
				System.out.print("Introduce el nombre para buscar su teléfono: ");
				nombre = sc.nextLine();
				System.out.println(agenda.getContactos().get(nombre));
				break;
			}
			case 4: {
				System.out.println("4. Eliminar contacto");
				System.out.println("Introduce el nombre del contacto a eliminar: ");
				System.out.println(agenda.getContactos().keySet());
				nombre = sc.nextLine();
				agenda.getContactos().remove(nombre);
				System.out.println();
				break;
			}
			case 5: {
				System.out.println("2. Listar contactos");
				System.out.println("Actualmenta hay " + agenda.totalContactos() + " contactos");
				break;
			}

			case 6: {
				System.out.println("6. Salir");
			}

			}
		} while (selector != 6);

	}

}
