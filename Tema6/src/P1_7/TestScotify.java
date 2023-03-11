package P1_7;

import java.time.LocalDate;

import P1_7.Cancion.genero;

public class TestScotify {

	public static void main(String[] args) {

		// String nombre, int duracion, int posicion, genero generoC

		Cancion c1 = new Cancion("cancion1", 180, 1, genero.Latino);
		Cancion c2 = new Cancion("cancion2", 181, 3, genero.Latino);
		Cancion c3 = new Cancion("cancion3", 182, 5, genero.Latino);
		Cancion c4 = new Cancion("cancion4", 183, 7, genero.Latino);
		Cancion c5 = new Cancion("cancion5", 184, 9, genero.Latino);
		Cancion c6 = new Cancion("cancion6", 185, 11, genero.Latino);
		Cancion c7 = new Cancion("cancion7", 186, 13, genero.Latino);
		Cancion c8 = new Cancion("cancion8", 187, 15, genero.Latino);
		Cancion c9 = new Cancion("cancion9", 188, 17, genero.Latino);

		Cancion c10 = new Cancion("cancion10", 171, 2, genero.Electronica);
		Cancion c11 = new Cancion("cancion11", 172, 4, genero.Electronica);
		Cancion c12 = new Cancion("cancion12", 173, 6, genero.Electronica);
		Cancion c13 = new Cancion("cancion13", 174, 8, genero.Electronica);
		Cancion c14 = new Cancion("cancion14", 175, 10, genero.Electronica);
		Cancion c15 = new Cancion("cancion15", 176, 12, genero.Electronica);
		Cancion c16 = new Cancion("cancion16", 177, 14, genero.Electronica);
		Cancion c17 = new Cancion("cancion17", 178, 16, genero.Electronica);

		// (String nombre, int duracion, LocalDate fecha, int capitulo)

		Podcast p1 = new Podcast("podcast1", 200, LocalDate.of(2023, 01, 01), 1);
		Podcast p2 = new Podcast("podcast2", 300, LocalDate.of(2023, 01, 02), 1);
		Podcast p3 = new Podcast("podcast3", 400, LocalDate.of(2023, 01, 03), 1);

		// (String nombre, String informacion)
		Autor a1 = new Autor("Joaquin Sabina", "cantautor jienense");
		Autor a2 = new Autor("Skrilex", "música estridente");

		// (String titulo, LocalDate fecha, String grupo, String discográfica)
		Disco d1 = new Disco("Lo mejor de Sabnia", LocalDate.of(2023, 02, 01), "Grupo 1", "Horizon west");
		Disco d2 = new Disco("Lo mejor de Skrilex", LocalDate.of(2023, 02, 01), "Grupo 2", "Soul master");

		d1.addCancion(c1);
		d1.addCancion(c2);
		d1.addCancion(c3);
		d1.addCancion(c4);
		d1.addCancion(c5);
		d1.addCancion(c6);
		d1.addCancion(c7);
		d1.addCancion(c8);
		d1.addCancion(c9);

		d2.addCancion(c10);
		d2.addCancion(c11);
		d2.addCancion(c12);
		d2.addCancion(c13);
		d2.addCancion(c14);
		d2.addCancion(c15);
		d2.addCancion(c16);
		d2.addCancion(c17);

		// Creamos el arraylist multimedia que está dentro de la clase Scotify
		Scotify scf = new Scotify();
		scf.addMultimedia(p1);
		scf.addMultimedia(p2);
		scf.addMultimedia(p3);
		scf.addMultimedia(c1);
		scf.addMultimedia(c2);
		scf.addMultimedia(c3);
		scf.addMultimedia(c4);
		scf.addMultimedia(c5);
		scf.addMultimedia(c6);
		scf.addMultimedia(c7);
		scf.addMultimedia(c8);
		scf.addMultimedia(c9);
		scf.addMultimedia(c10);
		scf.addMultimedia(c10);
		scf.addMultimedia(c11);
		scf.addMultimedia(c12);
		scf.addMultimedia(c13);
		scf.addMultimedia(c14);
		scf.addMultimedia(c15);
		scf.addMultimedia(c16);
		scf.addMultimedia(c17);

		// Vamos a reproducir 3 veces la canción 7 buscándola primero y reproduciéndola después.
		for (int i = 0; i < 3; i++) {
			if (scf.buscarMultimedia("cancion7") != null)
				// Se ejecutará el método reproducir del padre porque la clase canción no
				// sobreescribe el método
				// Si fuera un podcast si ejecutaría el método del hijo
				scf.buscarMultimedia("cancion7").reproducir();
			else
				System.out.println("Esa cancion no se encuentra en la BBDD de Scotify");
		}

		// Comprobamos que las reproducciones han aumentado
		System.out.println("La cacncion 7 tiene " + c7.getReproducciones() + " reproducciones");

		// Ahora vamos a reproducir 5 veces el podcast 2 buscándolo primero y reproduciéndolo después.
		for (int i = 0; i < 5; i++) {
			if (scf.buscarMultimedia("poscast2") != null)
				// Se ejecutará el método reproducir del padre porque la clase canción no
				// sobreescribe el método
				// Si fuera un podcast si ejecutaría el método del hijo
				scf.buscarMultimedia("podcast2").reproducir();
			else
				System.out.println("Esa cancion no se encuentra en la BBDD de Scotify");
		}
		
		// Comprobamos que las reproducciones han aumentado
		System.out.println("El podacast 2 tiene " + p2.getReproducciones() + " reproducciones");
	}

}
