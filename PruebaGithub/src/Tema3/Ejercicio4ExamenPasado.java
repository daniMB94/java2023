package Tema3;

import java.util.Scanner;

public class Ejercicio4ExamenPasado {
	
	public static void mostrar(String[][] nombres, double[][] precios) {
		for(int i = 0; i < nombres.length; i++) {
			for(int j = 0; j < nombres[i].length; j++) {
				System.out.println("Código: (" + i + "," + j + ") " + nombres[i][j] + " " + precios[i][j] + "€");;
			}
		}
	}
	
	public static double pedir(int[][] cantidades, double[][] precios, int coordX, int coordY) {
		double precio = 0;
		//ver si hay cantidad suficinete
		if(cantidades[coordX][coordY] > 0) {
			cantidades[coordX][coordY]--;
			precio = precios[coordX][coordY];
		} else {
			System.out.println("No hay cantidad suficiente de esa golosina");

		}
		
		return precio;
	}

	public static void main(String[] args) {
		
		String[][] nombresGolosinas = {
				 {"KitKat", "Chicles fresa", "Lacasitos", "Palotes"},
				 {"Kinder Bueno", "Haribo", "Chetoos", "Twix"},
				 {"Risketos", "M&M'S", "Mars", "Chicles menta"},
				 {"Doritos", "Palomitas", "Gusanitos", "Lays"}
			
		};
		double[][] precios = {
				 {1.1, 0.8, 1.5, 0.9},
				 {1.8, 1, 1.2, 1},
				 {1.8, 1.3, 1.2, 0.8},
				 {1.5, 1.1, 1.1, 1.1}
				};
		int[][] cantidades = {
			{5, 5, 5, 5},{5, 5, 5, 5},{5, 5, 5, 5},{5, 5, 5, 5},
		};
		
		
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int codigo = 0;
		int coordX = 0;
		int coordY = 0;
		double totalVentas = 0;
		String password;
		
		do {
			System.out.println("1. Pedir golosinas");
			System.out.println("2. Mostrar golosinas");
			System.out.println("3. Rellenar golosinas");
			System.out.println("4. Apagar máquina");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Pedir");
				System.out.println("Introduce código de golosina xy");
				try {
					codigo = Integer.parseInt(sc.nextLine());
					coordX = codigo / 10;
					coordY = codigo % 10;
					totalVentas = totalVentas + pedir(cantidades, precios, coordX, coordY);
				} catch (Exception e) {
					System.out.println("Código incorrecto");
				}
				
				break;
			case 2:
				System.out.println("Mostrar");
				mostrar(nombresGolosinas, precios);
				break;
			case 3:
				System.out.println("Rellenar");
				System.out.println("Dime la contraseña");
				password = sc.nextLine();
				if(password.equals("MaquinaExpendedora2017")) {
					try {
						codigo = Integer.parseInt(sc.nextLine());
						coordX = codigo / 10;
						coordY = codigo % 10;
						cantidades[coordX][coordY] = 5;
						totalVentas = totalVentas + pedir(cantidades, precios, coordX, coordY);
					} catch (Exception e) {
						System.out.println("Código incorrecto");
					}
				} else {
					System.out.println("Contraseña no válida");
				}
				break;
			case 4:
				System.out.println("Se han vendido " + totalVentas + "€");
				System.out.println("Apagar");
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}
			
		} while (opcion != 4);
		
	}

}
