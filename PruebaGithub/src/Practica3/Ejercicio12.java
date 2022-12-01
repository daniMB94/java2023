package Practica3;

public class Ejercicio12 {

	public static void Romano(int numero) {
		int aux;
		String numeroRomano = "";
		aux = numero;
		while(aux / 1000 > 0) {
			numeroRomano = numeroRomano.concat("M");
			aux = aux - (aux/1000);
		}
		aux = numero;
		
		
		
		
	}
	
	public static void main(String[] args) {

		
		
	}

}
