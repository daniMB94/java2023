package Tema2;

public class Ejer_repaso1 {

	public static void main(String[] args) {
		//1. Pinta todas las decenas del 1 al 10000
		//2. Suma todos los números impares del 1 al 1000
		//3. Muestra los números enteros -1 y 1, separados por 0.01
		//4. Genera un número aleatorio entre 1 y 100. Muestra todos los números entre 1 y 100 menos ese aleatorio
		System.out.println("EJERCICIO 1");
		for(int i = 1; i <= 10000; i++) {
			
			if(i%10 == 0)
			System.out.println(i);
		}
		
		int impares = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i%2 != 0) {
				
				
				impares = impares + i;
				
				
			}
		}
		System.out.println("EJERCICIO 2");
		System.out.println(impares);
		
		System.out.println("EJERCICIO 3");
		
		for(double i=-1d; i <=1d; i+=0.01) {
			System.out.println(i);
		}
		System.out.println("EJERCICIO 4");
		int numero = (int) ((Math.random()*100) + 1);
		System.out.println(numero);
		
		for(int i = 1; i <= 100; i++) {
			if (i != numero) {
				System.out.println(i);
			}
			
		}
		
		
		}
		
	}
		



