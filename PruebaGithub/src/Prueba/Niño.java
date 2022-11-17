package Prueba;

public class Niño {

	public static void main(String[] args) {

		int edad = 2;
		char sexo = 'M';
		
		if (sexo == 'H') {
			System.out.print("Eres un chico");
		}	else {
			System.out.print("Eres una chica");
		}
		
		if (edad <= 11) {
			System.out.println(" y eres un niño/a");
			
		} else if (edad > 11 & edad <= 18) {
			
				System.out.println(" y eres adolescente");
		
			
		}  else if (edad > 18 & edad <= 29) {
			
			System.out.println(" y eres joven");
		} else if (edad > 29 & edad >= 55) {
			System.out.println (" y eres adulto");
		}
		
		 else if (edad > 55 & edad <= 999) {
		System.out.println (" y eres anciano/a");
		
		}
	}}
