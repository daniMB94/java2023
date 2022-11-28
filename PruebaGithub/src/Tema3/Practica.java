package Tema3;

public class Practica {

	public static void main(String[] args) {

		//crea un array con 5 notas. Devuelve la nota media
		
		double notas[] = {6.6, 7, 8.8, 9, 4};
		
		double media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			media = media + notas[i];
		}
		
		System.out.println("La nota media es: " + media / notas.length);
		
	}

}
