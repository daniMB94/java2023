package Practica2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {


		int t;
		
		
		System.out.println("Introduce el tiempo en segundos: ");
		Scanner sc = new Scanner(System.in);
		t = Integer.parseInt(sc.nextLine());
		
		System.out.println("Si se expresa en horas es: " + (t / 60 / 60));
		System.out.println("Si se expresa en minutos es: " + (t / 60));
		System.out.println("Si se expresa en segundos es: " + t);
		
		
		
	}

}
