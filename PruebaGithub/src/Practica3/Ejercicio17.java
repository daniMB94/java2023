package Practica3;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce otro número: ");
		num2 = Integer.parseInt(sc.nextLine());

		if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					System.out.print("# ");
					i++;
				}
				if(i!=num2+1)
					System.out.print(i + ", ");
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0) {
					System.out.print("# ");
					i++;
				}
				if(i!=num1+1)
					System.out.print(i + ", ");
			}
		}



	}

}
