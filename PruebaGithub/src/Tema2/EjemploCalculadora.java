package Tema2;

import java.util.Scanner;

public class EjemploCalculadora {

	public static void main(String[] args) {


		//Menú
		//1. Sumar
		//2. Restar
		//3. Multiplicar
		//4. Dividir
		
		//Una vez pulsada una opción, pedirá dos números por teclado y hará la operación correspondiente
		//Pintando el resultado
		
		
		int opcion = 0;
		double num1 = 0, num2 = 0, suma, resta, division, multiplicacion;
		
				//CREAR SCANNER
				Scanner sc = new Scanner(System.in);
				
				
				do {
					
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
							System.out.print("Introduce el número 1: ");
							num1 = Double.parseDouble(sc.nextLine());
							System.out.print("Introduce el número 2: ");
							num2 = Double.parseDouble(sc.nextLine());
							suma = num1 + num2;
							System.out.print("La suma de " + num1 + " + " + num2 + " es: " + suma);
							System.out.println("");
							break;
					
						case 2: 
							System.out.print("Introduce el número 1: ");
							num1 = Double.parseDouble(sc.nextLine());
							System.out.print("Introduce el número 2: ");
							num2 = Double.parseDouble(sc.nextLine());
							resta = num1 - num2;
							System.out.print("La resta de " + num1 + " - " + num2 + " es: " + resta);
							System.out.println("");
							break;
							
						case 3:
							System.out.print("Introduce el número 1: ");
							num1 = Double.parseDouble(sc.nextLine());
							System.out.print("Introduce el número 2: ");
							num2 = Double.parseDouble(sc.nextLine());
							division = num1 * num2;
							System.out.print("La multiplicación de " + num1 + " * " + num2 + " es: " + division);
							System.out.println("");
							break;
							
						case 4:
							System.out.print("Introduce el número 1: ");
							num1 = Double.parseDouble(sc.nextLine());
							System.out.print("Introduce el número 2: ");
							num2 = Double.parseDouble(sc.nextLine());
							multiplicacion = num1 / num2;
							System.out.print("La división de " + num1 + " / " + num2 + " es: " + multiplicacion);
							System.out.println("");
							break;
							
						case 5:
							System.out.println("Aplicación finalizada");
						
						default:
							System.out.println("Opción incorrecta (1, 2, 3, 4)");
				}
				
			} while (opcion != 5);
		
	}

}
