package Tema3;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10]; //array de int de 10 números
		int numeros2[];
		float precios[] = {10.0f, 11f, 9.99f, 8.25f};
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		
		//Pintar
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//Pintar
		for(int i = 0; i < precios.length; i++) {
					System.out.println(precios[i]);
		}
		
		numeros2 = numeros.clone(); //copiar un array en otro
		numeros2[3] = 1000;
		//Pintar
		for(int i = 0; i < numeros2.length; i++) {
		System.out.println(numeros2[i]);
		}

}
}
