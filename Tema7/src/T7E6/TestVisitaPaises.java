package T7E6;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TestVisitaPaises {

	public static void main(String[] args) {

		VisitadoHM hm = new VisitadoHM();
		
		//Introducimos los paises
		hm.addPais("Marruecos");
		hm.addPais("Italia");
		hm.addPais("España");
		hm.addPais("Estados Unidos");
		hm.addPais("Noruega");
		hm.addPais("Japon");
		
		//Introducimos ciudades a cada país
		hm.addCiudad("Japon", "Tokio");
		hm.addCiudad("Japon", "Kioto");
		hm.addCiudad("Japon", "Osaka");
		hm.addCiudad("Marruecos", "Casa Blanca");
		hm.addCiudad("Marruecos", "Fez");
		hm.addCiudad("Marruecos", "Sale");
		hm.addCiudad("Marruecos", "Marrakech");
		hm.addCiudad("España", "Madrid");
		hm.addCiudad("España", "Toledo");
		hm.addCiudad("Noruega", "Oslo");
		hm.addCiudad("Noruega", "Bergen");
		hm.addCiudad("Estados Unidos", "Washington");
		hm.addCiudad("Italia", "Milan");
		hm.addCiudad("Italia", "Modena");
		hm.addCiudad("Italia", "Roma");
		
		System.out.println(hm.mostrarVisitados());
		
		//Comprobamos el método "heVisitado"
		System.out.println("--------------------------------------------");
		System.out.println("He visitado la ciudad de Estocolmo en Suecia?");
		System.out.println(hm.heVisitado("Suecia", "Estocolmo"));
		System.out.println("");
		System.out.println("He visitado la ciudad de Modena en Italia?");
		System.out.println(hm.heVisitado("Italia", "Modena"));
		
		// Ahora comprobamos la ordenación inversa por paises con la clase VisitadoTM
		VisitadoTM tm = new VisitadoTM();
		
		
	}

}
