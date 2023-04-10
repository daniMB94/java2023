package T7E2;

import java.util.Scanner;

public class TestBiblioteca {

	public static void main(String[] args) {

		int selector = 0;
		String titulo = "";
		Scanner sc = new Scanner(System.in);

		BibliotecaTS b = new BibliotecaTS("Calle Altamira nº 6, Almería");

		Libro l1 = new Libro("isbn1", "Libro1", 2020, 193);
		Libro l2 = new Libro("isbn2", "Libro2", 2023, 235);
		Libro l3 = new Libro("isbn3", "Libro3", 2022, 593);
		Libro l4 = new Libro("isbn4", "Libro4", 2021, 593);
		Libro l5 = new Libro("isbn5", "Libro5", 2023, 219);
		Libro l6 = new Libro("isbn6", "Libro6", 2022, 79);
		Libro l7 = new Libro("isbn7", "Libro7", 2019, 609);
		Libro l8 = new Libro("isbn8", "Libro8", 2017, 321);
		Libro l9 = new Libro("isbn9", "Libro9", 2023, 532);
		Libro l10 = new Libro("isbn10", "Libro10", 2022, 1000);

		Revista r1 = new Revista("isbn1", "Revista1", 2022, 389, 1);
		Revista r2 = new Revista("isbn2", "Revista2", 2021, 193, 54);
		Revista r3 = new Revista("isbn3", "Revista3", 2021, 173, 28);
		Revista r4 = new Revista("isbn4", "Revista4", 2019, 102, 4);
		Revista r5 = new Revista("isbn5", "Revista5", 2017, 49, 73);

		b.adquirirMaterial(l1);
		b.adquirirMaterial(l2);
		b.adquirirMaterial(l3);
		b.adquirirMaterial(l4);
		b.adquirirMaterial(l5);
		b.adquirirMaterial(l6);
		b.adquirirMaterial(l7);
		b.adquirirMaterial(l8);
		b.adquirirMaterial(l9);
		b.adquirirMaterial(l10);
		b.adquirirMaterial(r1);
		b.adquirirMaterial(r2);
		b.adquirirMaterial(r3);
		b.adquirirMaterial(r4);

		
		Autor a1 = new Autor("Arturo", "Perez Reverte", 72, "Madrid", "C/ libertad", "arreverte.gmail.com");
		Autor a2 = new Autor("Ildefonso", "Falcones", 72, "Barcelona", "C/ estrecha", "ifalcones.gmail.com");
		Autor a3 = new Autor("Laura", "Piedra", 48, "Almeria", "C/ el bobar", "lpiedra@ual.es");
		Autor a4 = new Autor("Maria del Carmen", "Vals", 65, "Almeria","Avda del mediterraneo", "mvals@ual.es");
		
		
		l1.addAutor(a1.getNombre(), a1.getApellidos());
		l2.addAutor(a1.getNombre(), a1.getApellidos());
		l3.addAutor(a1.getNombre(), a1.getApellidos());
		l4.addAutor(a1.getNombre(), a1.getApellidos());
		l5.addAutor(a1.getNombre(), a1.getApellidos());
		l6.addAutor(a2.getNombre(), a2.getApellidos());
		l7.addAutor(a2.getNombre(), a2.getApellidos());
		l8.addAutor(a2.getNombre(), a2.getApellidos());
		l9.addAutor(a2.getNombre(), a2.getApellidos());
		l10.addAutor(a2.getNombre(), a2.getApellidos());

		
		r1.addAutor(a3.getNombre(), a3.getApellidos());
		r1.addAutor(a4.getNombre(), a4.getApellidos());
		r2.addAutor(a3.getNombre(), a3.getApellidos());

		do {

			System.out.println("1. PRESTAR.");
			System.out.println("2. DEVOLVER.");
			System.out.println("3. BUSCAR.");
			System.out.println("4. SALIR.");

			selector = Integer.parseInt(sc.nextLine());
			switch (selector) {
			case 1:
				System.out.println("Introduce un titulo: ");
				titulo = sc.nextLine();
				if (b.buscar(titulo) != null) {
					b.buscar(titulo).presta();
					System.out.println(b.buscar(titulo).toString());
				}

				else
					System.out.println("Ese libro no esta en la biblioteca");
				break;
			case 2:
				System.out.println("Introduce un titulo: ");
				titulo = sc.nextLine();
				if (b.buscar(titulo) != null) {
					if (b.buscar(titulo).estaPrestado() == true) {
						b.buscar(titulo).devuelve();
						System.out.println(b.buscar(titulo).toString());
					}

				} else
					System.out.println("Ese libro ya se encuetra en la biblioteca");
				break;
			case 3:
				System.out.println("Introduce un titulo: ");
				titulo = sc.nextLine();
				System.out.println(b.buscar(titulo).toString());
				break;
			case 4:
				break;
			}

		} while (selector != 4);

		//Este syso es para probar el método que devuelve un arraylist de publicaciones de un autor en concreto
		System.out.println("Veamos las publicaciones en las que aparece Laura Piedra");
		System.out.println(b.buscar(a3));
		System.out.println("Ahora veamos las publicaciones en las que aparece Maria del Carmen Vals");
		System.out.println(a4);

	}

}
