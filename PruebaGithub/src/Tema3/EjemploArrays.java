package Tema3;

public class EjemploArrays {

	/**
	 * Pinta un vector de enteros de cualquier tamaño
	 * @param vector
	 */
	public static void pintarVectorInt(int vector[]) {
		System.out.print("[");
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]);
			//Para no pintar la última ,
			if(i != vector.length-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		//1. Crear un array de 15 elementos con valores aleatorios entre 1 y 100
		//2. Suma los números que sean impares
		//3. Suma los números que estén en posiciones pares
		
		int numeros[] = new int[15];
		
		//  Generar los números dentro del array
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100) + 1;
		}
		
		pintarVectorInt(numeros);
		
		//Sumar los que sean impares
		int total=0, totalPares=0;
		for(int i=0; i < numeros.length; i++) {
			//Comprueba que sea impar
			if (numeros[i] % 2 != 0) {
				total += numeros[i];
			}
			//Comprueba que sea una posición par (0,2,4,6,8,10,12,14)
			if (i % 2 == 0) {
				totalPares += numeros[i];
			}
		}
		
		System.out.println("Total de los impares es " + total);
		System.out.println("Total de los que están en posiciones pares es " + totalPares);
		
		
		

	}

}


