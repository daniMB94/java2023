package Ejercicio5;

public class NumeroAPP {

	public static void main(String[] args) {

		int suma = 4;
		int resta = 1;
		
		Numero num1 = new Numero();
		
		System.out.println(num1);
		System.out.println("");
		
		
		
		System.out.println("Si le sumamos " + suma);
		System.out.println(num1.suma(suma));
		System.out.println("");
		
		System.out.println("Si le restamos " + resta);
		System.out.println(num1.resta(resta));
		
	}

}
