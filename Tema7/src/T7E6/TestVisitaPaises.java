package T7E6;

public class TestVisitaPaises {

	public static void main(String[] args) {

		VisitadoHM hm = new VisitadoHM();
		
		hm.addPais("Marruecos");
		hm.addPais("Italia");
		hm.addPais("España");
		hm.addPais("Estados Unidos");
		hm.addPais("Noruega");
		hm.addPais("Japon");
		
		hm.addCiudad("Japon", "Tokio");
		hm.addCiudad("Japon", "Kioto");
		hm.addCiudad("Japon", "Osaka");
		hm.addCiudad("Marruecos", "Casa Blanca");
		hm.addCiudad("Marruecos", "Fez");
		hm.addCiudad("Marruecos", "Salé");
		hm.addCiudad("Marruecos", "Marrakech");
		hm.addCiudad("España", "Madrid");
		hm.addCiudad("España", "Toledo");
		hm.addCiudad("Noruega", "Oslo");
		hm.addCiudad("Noruega", "Bergen");
		hm.addCiudad("Estados Unidos", "Washington");
		hm.addCiudad("Italia", "Milan");
		hm.addCiudad("Italia", "Modena");
		hm.addCiudad("Italia", "Roma");
		
		hm.mostrarVisitados();
		
		
	}

}
