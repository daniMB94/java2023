package Tema3;

public class Practica1 {

	public static void main(String[] args) {

		
		int mayor = 0, menor = 0;
		//Saca el mayor y el menor de un array de 10 enteros aleatorios
		int numeros[] = new int[10];
		
		//Generar los números dentro del array
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100) + 1;
		}
		
		//Pintar el array para ver si se han generado los números aleatorios
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Sacamos el mayor y el menor
		mayor = numeros[0];
		menor = numeros[0];
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
			if(numeros[i] < menor) {
				menor = numeros [i];
			}
			
		}
		
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
	
	}

}
