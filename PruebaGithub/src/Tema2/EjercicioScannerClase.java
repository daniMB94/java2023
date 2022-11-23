package Tema2;

import java.util.Scanner;

public class EjercicioScannerClase {

	public static void main(String[] args) {


		//1. Leer de teclado el nombre de un empleado
		//2. Leer de teclado el sueldo bruto del empleado
		//3. Leer de teclado del IRPF que se le va a aplicar (18, 12, ...)
		//4. Resultado debe ser el sueldo neto del empleado (restando % del IRPF)
		//sueldoNeto = sueldo - (sueldo * IRPF/100)
		
		String nombre;
		double sueldo = 0d, sueldoNeto = 0d;
		int irpf = 0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Indique el nombre del empleado: ");
			nombre = sc.nextLine();
			System.out.println("Indique el suedo bruto del empleado: ");
			sueldo = Double.parseDouble(sc.nextLine());
			System.out.println("Indique el tipo impositivo al que tributa el empleado: ");
			irpf = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sueldoNeto = (sueldo - (sueldo * irpf / 100));
		
		System.out.println("El empleado tiene un sueldo neto de: " + sueldoNeto + "€");
		
		
	}

}
