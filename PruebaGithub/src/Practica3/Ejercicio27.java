package Practica3;

import java.util.Scanner;

public class Ejercicio27 {
	
	public static void adivino() {
		String respuesta = "";
		int numero, maximo = 100, minimo = 1, contador = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			numero = (int) (Math.random() * (maximo+1) - minimo) + minimo;
			System.out.println("Indica escribiendo si el numero que has pensado es 'mayor', 'menor' o 'igual' a " + numero);
			respuesta = sc.nextLine();
			if(respuesta.equals("mayor")) {
				minimo = numero;
			} else  if(respuesta.equals("menor")){
				maximo = numero;
			}
			contador += 1;
			
		} while(respuesta != "igual");
		
		System.out.println("Ya lo tengo! el número que habías pensado es: " + numero);
		System.out.println("He necesitado " + contador + " rondas para adivinarlo");
	}

	public static void main(String[] args) {
		
		
		adivino();
		

		
		
	}

}
