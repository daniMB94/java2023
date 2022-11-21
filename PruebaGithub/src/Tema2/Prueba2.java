package Tema2;

public class Prueba2 {

	public static void main(String[] args) {

		//del 1 al 100 con for
		int numero = 0;
		for(numero = 1; numero <= 100; numero++) {
			System.out.println(numero);
		}
		
		//del 100 al 1 con for
		//lo correcto es declararla dentro del "for" y no haciendolo al principio con las demás variables
		for(int i=100; i >= 1; i--) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 4)
				break;
		}
	}

}
