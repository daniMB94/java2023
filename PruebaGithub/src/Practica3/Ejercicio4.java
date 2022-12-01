package Practica3;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void CambioMinimo(int importe) {
		int contador = 0;


		System.out.println("La mínima cantidad de billetes será: ");
		
		while(importe / 200 > 0) {
			contador = contador + 1;
			importe = importe - 200;
		}

		System.out.println(contador + " Billetes de 200€");
		contador = 0;
		while(importe / 100 > 0) {
			contador = contador + 1;
			importe = importe - 100;
		}
		System.out.println(contador + " Billetes de 100€");
		contador = 0;
		while(importe / 50 > 0) {
			contador = contador + 1;
			importe = importe - 50;
		}
		System.out.println(contador + " Billetes de 50€");
		contador = 0;
		while(importe / 20 > 0) {
			contador = contador + 1;
			importe = importe - 20;
		}
		System.out.println(contador + " Billetes de 20€");
		contador = 0;
		while(importe / 10 > 0) {
			contador = contador + 1;
			importe = importe - 10;
		}
		System.out.println(contador + " Billetes de 10€");
		contador = 0;
		while(importe / 5 > 0) {
			contador = contador + 1;
			importe = importe - 5;
		}
		System.out.println(contador + " Billetes de 5€");
		contador = 0;
		while(importe / 2 > 0) {
			contador = contador + 1;
			importe = importe - 2;
		}
		System.out.println(contador + " Monedas de 2€");
		contador = 0;
		while(importe / 1 > 0) {
			contador = contador + 1;
			importe = importe - 1;
		}
		System.out.println(contador + " Monedas de 1€");
		contador = 0;
		


	}

	public static void main(String[] args) {


		int importe;

		System.out.println("Introduce un importe: ");
		
		Scanner sc = new Scanner(System.in);
		importe = Integer.parseInt(sc.nextLine());
		
		CambioMinimo(importe);
		
	}

}
