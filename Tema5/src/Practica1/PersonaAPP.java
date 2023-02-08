package Practica1;

import java.util.Scanner;

public class PersonaAPP {

	public static void main(String[] args) {

		String nombre = null, DNI = null;
		int edad = 0;
		double peso = 0, altura = 0;
		String sexo = null;
		boolean error = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce todos los atributos del objeto persona:");
		do {
			try {
				System.out.print("Nombre :");
				nombre = sc.nextLine();
				System.out.print("Edad: ");
				edad = Integer.parseInt(sc.nextLine());
				System.out.print("Sexo: ");
				sexo = sc.nextLine();
				System.out.print("DNI: ");
				DNI = sc.nextLine();
				System.out.print("Altura :");
				altura = Double.parseDouble(sc.nextLine());
				System.out.print("Peso: ");
				peso = Double.parseDouble(sc.nextLine());
				error = false;

			} catch (Exception e) {
				System.out.println("Tipo de dato incorrecto. Vuelve a introducir el dato");
				error = true;
			}
		} while (error == true);

		Persona p1 = new Persona(nombre, edad, DNI, peso, altura, Persona.sexo.valueOf(sexo));

		System.out.println(p1.toString());
		if (p1.esMayordeEdad())
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");

		switch (p1.calculaIMC()) {
		case -1: {
			System.out.println("Tiene sobrepeso");
			break;
		}
		case 0: {
			System.out.println("Está por debajo de su peso ideal");
			break;
		}
		case 1: {
			System.out.println("Está en su peso ideal");
			break;
		}
		default:
			throw new IllegalArgumentException("Revisar el método 'IMC' de la clase persona");
		}

		System.out.println("Vamos a crear otra persona");
		Persona p2 = new Persona ("Federico", 45, DNI, 95, 1.95, Persona.sexo.H);
		
		if(p1.equals(p2)) {
			System.out.println(p1.getNombre() + " con " + p1.getDNI() + " es igual a " + p2.getNombre() + " con " + p2.getDNI());
		}
		else
			System.out.println(p1.getNombre() + " con " + p1.getDNI() + " es distint@ a " + p2.getNombre() + " con " + p2.getDNI());
	}

}
