package Tema2;

import java.util.Scanner;

public class PruebaScanner1 {

	public static void main(String[] args) {

		int cantidad = 0;
		double precio = 0d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el precio del producto");
		precio = sc.nextDouble();
		System.out.println("Dime la cantidad que quieres comprar");
		cantidad = sc.nextInt();
		
		System.out.println("Total de la compra " + (precio * cantidad));
		
		
	}

}
