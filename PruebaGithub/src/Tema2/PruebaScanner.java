package Tema2;

import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) {
		
		int numero = 0, error;
		
		Scanner sc = new Scanner(System.in); //al método que crea la clase escaner hay que indicarle de donde se debe leer la entrada de datos. En este caso System.in, que es la entrada de teclado y otras entradas estándar
		error = 0;
		do {
			try {
			numero = Integer.parseInt(sc.nextLine());
			error = 0;
			} catch (Exception e) {
			System.out.println("Te has equivocado, introduce un entero por favor");
			error = 1;
			}
		}	while (error == 1);
		
		System.out.println(numero);
		
	}

}
