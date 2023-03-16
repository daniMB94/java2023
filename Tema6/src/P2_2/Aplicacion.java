package P2_2;

import P2_2.Genero.GeneroMulti;

public class Aplicacion {

	public static void main(String[] args) {

		/*
		 * 
		 * Añade 10 series al catálogo. Simula que cada cliente vea 5 series, y calcula
		 * las ganancias.
		 * 
		 * 
		 * Ejemplo de cómo añadir crear una serie de 10 temporadas y 10 episodios por
		 * temporada: Serie serie = new Serie("Breaking Bad", true, 10,
		 * Genero.THRILLER); for(int i=0; i<10; i++) { Temporada t = new Temporada(i);
		 * 
		 * for(int j=0; j<10; j++) { t.addEpisodio(new Episodio("Episodio "+j, 50)); }
		 * serie.addTemporada(t); }
		 * 
		 * 
		 */

		PrimeVideo pv = new PrimeVideo();

		Series s1 = new Series("Strangers", true, 5.95, GeneroMulti.TERROR);
		for (int i = 0; i < 10; i++) {
			Temporada t1 = new Temporada(i);
			for (int j = 0; j < 10; j++) {
				t1.addEpisodio(new Episodio("Episodio ", 50, t1));
			}
			s1.addTemporada(t1);
		}
		
		//Creamos 2 clientes primevideo
		ClientePrime cp1 = new ClientePrime("83928392t", "Dani");
		ClientePrime cp2 = new ClientePrime("38383838p", "Laura");
		//Creamos 2 clientes primevideopro
		ClientePrimePro cpp1 = new ClientePrimePro("63829382e", "Rodrigo");
		ClientePrimePro cpp2 = new ClientePrimePro("53827392q", "Pilar");
		
		//Añadimos multimedia y suscriptores a PrimeVideo
		pv.addMultimedia(s1);
		pv.addSuscriptor(cp1);
		pv.addSuscriptor(cp2);
		pv.addSuscriptor(cpp1);
		pv.addSuscriptor(cpp2);
		
		//Simulamos la visualización de la serie s1 por ambos clientes (5 cada uno)
		for (int i = 0; i < 10; i++) {
			if (i < 5)
				pv.ver(s1, cp1);
			else
				pv.ver(s1, cp2);
		}

		System.out.println("Las ganancias han sido "+ pv.getGanancias());
	}

}
