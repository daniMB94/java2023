package Ahorcado;

import java.util.ArrayList;

public class Ahorcado {

	private static ArrayList<Palabras> palabras;
	private String palabraAdivinar;
	private String palabraActual;

	public Ahorcado() {
		// Elegir una palabra al azar de 'palabras' y ponerla en 'palabrasAAdivinar'
		// Rellenar con guiones (tantos como 'palabraAAdivinar') el string
		// 'palabraActual'
		
		palabraActual = (palabras.get((int) (Math.random() * (palabras.size() - 0) + 0))).toString();
		int longitudPalabraActual;
		longitudPalabraActual = palabraActual.length();
		palabraActual = "";
		for (int i = 0; i < longitudPalabraActual; i++) {
			palabraActual = palabraActual + " _ ";
		}
		
	}

	/*
	 * Busca la letra en 'palabraAAdivinar', y si aparece la coloca en la msma
	 * posición en 'palabraActual'
	 * 
	 * 
	 */

	public boolean intentar(char letra) {

		String memo;
		memo = palabraAdivinar;
		for (int i = 0; i < palabraActual.length(); i++) {
			palabraAdivinar = palabraAdivinar.replace((char) '_', letra);

		}
		if (memo.equals(palabraAdivinar))
			return false;
		else
			return true;

	}
	
	//Metodo introducir palabra
	public void addPalabra(Palabras palabra) {
		
	}

	/*
	 * Comprobar que 'palabra' es igual a 'palabraAAdivinar', si son igual devuelve
	 * true (has ganado), si o false (has perdido)
	 * 
	 */

	public boolean resolver(String palabra) {
		return false;
	}

	public String getPalabraActual() {
		return this.palabraActual;
	}
}
