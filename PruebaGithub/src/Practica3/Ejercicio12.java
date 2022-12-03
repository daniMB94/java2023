package Practica3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void Romano(int numero) {
		int millar = 0, centena = 0, decena = 0, unidad = 0;
		
		if (numero / 1000 > 0) {
			millar = numero / 1000;
		}
		numero = numero - millar * 1000;
		if (numero / 100 > 0) {
			centena = numero / 100;
		}
		numero = numero - centena * 100;
		if (numero / 10 > 0) {
			decena = numero / 10;
		}
		numero = numero - decena * 10;
		if (numero > 0)
		unidad = numero;
	
		switch (millar) {
		case 3: {
			System.out.print("MMM");
			break;
		}
		case 2: {
			System.out.print("MM");
			break;
		}
		case 1: {
			System.out.print("M");
			break;
		}
		}
		switch (centena) {
		case 9: {
			System.out.print("CM");
			break;
		}
		case 8: {
			System.out.print("DCCC");
			break;
		}
		case 7: {
			System.out.print("DCC");
			break;
		}
		case 6: {
			System.out.print("DC");
			break;
		}
		case 5: {
			System.out.print("D");
			break;
		}
		case 4: {
			System.out.print("CD");
			break;
		}
		case 3: {
			System.out.print("CCC");
			break;
		}
		case 2: {
			System.out.print("CC");
			break;
		}
		case 1: {
			System.out.print("C");
			break;
		}
		}
		switch (decena) {
		case 9: {
			System.out.print("XC");
			break;
		}
		case 8: {
			System.out.print("LXXX");
			break;
		}
		case 7: {
			System.out.print("LXX");
			break;
		}
		case 6: {
			System.out.print("LX");
			break;
		}
		case 5: {
			System.out.print("L");
			break;
		}
		case 4: {
			System.out.print("XL");
			break;
		}
		case 3: {
			System.out.print("XXX");
			break;
		}
		case 2: {
			System.out.print("XX");
			break;
		}
		case 1: {
			System.out.print("X");
			break;
		}
		}
		switch (unidad) {
		case 9: {
			System.out.print("IX");
			break;
		}
		case 8: {
			System.out.print("VIII");
			break;
		}
		case 7: {
			System.out.print("VII");
			break;
		}
		case 6: {
			System.out.print("VI");
			break;
		}
		case 5: {
			System.out.print("V");
			break;
		}
		case 4: {
			System.out.print("IV");
			break;
		}
		case 3: {
			System.out.print("III");
			break;
		}
		case 2: {
			System.out.print("II");
			break;
		}
		case 1: {
			System.out.print("I");
			break;
		}
		}
	}
	
	
		

	public static void main(String[] args) {

		int numero = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número de 4 cifras o menos: ");
		try	{
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception E) {
			System.out.println("Se deben introducir números");
		}

		Romano(numero);
	}

}
