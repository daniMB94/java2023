package EjerciciosPOO;

import java.util.Scanner;

public class FinanzasAPP {

	public static void main(String[] args) {

		double euro = 25.82;
		double dolar = 57.92;
		double tipoCambio = 0;
		
		Finanzas cambioDiv = new Finanzas();
		
		
			System.out.println(cambioDiv);
			
			System.out.println("");
			
			System.out.println("Veamos el cambio de " + euro + " euros a dolares");
			System.out.println(cambioDiv.dolares(euro));
			
			System.out.println("");
			
			System.out.println("Veamos el cambio de " + dolar + " dolares a euros");
			System.out.println(cambioDiv.euros(dolar));
			
			System.out.println("Ahora vamos a cambiar el tipo de cambio y veremos como quedan las conversiones");
			Scanner sc = new Scanner(System.in);
			tipoCambio = sc.nextDouble();
			
			cambioDiv.setCambio(tipoCambio);
			
			System.out.println(cambioDiv);
			
			System.out.println("");
			
			System.out.println("Veamos el cambio de " + euro + " euros a dolares");
			System.out.println(cambioDiv.dolares(euro));
			
			System.out.println("");
			
			System.out.println("Veamos el cambio de " + dolar + " dolares a euros");
			System.out.println(cambioDiv.euros(dolar));
			
			System.out.println("Ahora vamos a cambiar el tipo de cambio y veremos como quedan las conversiones");
		
		
	}

}
