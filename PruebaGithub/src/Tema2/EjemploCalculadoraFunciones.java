package Tema2;

import java.util.Scanner;

public class EjemploCalculadoraFunciones {
	
	/*
	 * Función que se le pasa un Scanner y lee el double de teclado
	 */
	
	public static double leerTeclado() {
		double numero = 0;
		//CREAR SCANNER
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		try {
			numero = Double.parseDouble(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		return numero;
	}

	public static void main(String[] args) {

		int opcion = 0;
		double numero1, numero2, resultado;

		
		
		do {		
			//CREAR SCANNER
			Scanner sc = new Scanner(System.in);
			
			//PINTAN LAS OPCIONES
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			
			//PIDE QUE EL USUARIO ELIJA SU OPCIÓN
			
			System.out.print("Dime la opción que eliges: ");
			try {
				opcion = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Opción incorrecta (1, 2, 3, 4)");
			}

			
			//HARÍA ACCIONES EN FUNCIÓN DE LA OPCIÓN ELEGIDA
			
			switch (opcion) {
				case 1: 
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 + numero2;
					System.out.println(resultado);

					break;
			
				case 2: 
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 - numero2;
					System.out.println(resultado);

					break;
				case 3:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 * numero2;
					System.out.println(resultado);

					break;
				case 4:
					numero1 = leerTeclado();
					numero2 = leerTeclado();
					resultado = numero1 / numero2;
					System.out.println(resultado);

					break;
					
				case 5:
					System.out.println("Aplicación finalizada");
					break;
					
				default:
					System.out.println("Opción incorrecta (1, 2, 3, 4, 5)");
		}
		
	} while (opcion != 5);
	}

}
