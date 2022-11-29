package Tema3;

public class EjemploArrays4 {
	
	public static boolean esPrimo(int numero) {
		boolean primo = true;
		for(int i = 2; i < numero; i++) {
			if (numero % i ==0) {
				primo = false;
				break;
			}
		}
		return primo;
	}
	
	//public static void pintar() TERMINAR ESTE TROZO DE CÓDIGO
		
	

	public static void main(String[] args) {

		//1. crea un array de 100 elementos, con valores aleatorios del 1 al 50
		//2. suma aquellos números que sean primos. Pinta los que sean primmos
		
		int numeros[] = new int[100];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (51 - 0)) + 0;
		}
		
		//pintar vector
		
		int total = 0;
		for(int i = 0; i < numeros.length; i++) {
			if (esPrimo(numeros[i])) {
				total += numeros[i];
				System.out.println("Este número es primo: " + numeros[i]);
				
			}
		}
		
		System.out.println("El total de los números primos es " + total);
	}

}
