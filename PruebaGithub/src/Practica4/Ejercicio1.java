package Practica4;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numeros[i] = (int) (Math.random() * (100 + 1) - 1) + 1;
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(i == 0) {
				System.out.print(numeros[i]);
			}
			System.out.print(", " + numeros[i]);
		}
		
	}

}
