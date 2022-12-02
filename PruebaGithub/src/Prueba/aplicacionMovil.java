package Prueba;

import java.util.Scanner;

public class aplicacionMovil {

	 public static void main(String[] args) {

	        int tiradaMia, tiradaMaquina, sumaMia = 0, sumaMaquina = 0;
	        String respuesta;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Mis tiradas son: ");
	        for (int i = 1; i <= 3; i++) {
	            tiradaMia = (int) (Math.random() * (6 + 1 - 1)) + 1;
	            System.out.print(tiradaMia + ", ");
	            sumaMia = sumaMia + tiradaMia;
	        }
	        System.out.println();
	        
	        System.out.println("La suma de mis tiradas es: " + sumaMia);
	        for (int i = 1; i <= 3; i++) {
	            tiradaMaquina = (int) (Math.random() * (6 + 1 - 1)) + 1;
	            sumaMaquina = sumaMaquina + tiradaMaquina;
	        }


	        System.out.print("¿Con esa puntuación crees que puedes vencer a la máquina? (escribe si o no)");

	        respuesta = sc.nextLine();
	        if (respuesta.equalsIgnoreCase("si"))
	            if (sumaMia > sumaMaquina)
	                System.out.println("Felicidades! Has ganado! La puntuación de la máquina es " + sumaMaquina);
	            else {
	                System.out.println("Lo siento, la puntuación de la máquina es " + sumaMaquina);
	                System.out.println("Otra vez sera");
	            }
	        else if (respuesta.equalsIgnoreCase("no")) {
	            if (sumaMia > sumaMaquina)
	                System.out.println("Lo siento! Hubieses ganado! La puntuación de la máquina es " + sumaMaquina);
	            else {
	                System.out.println("Bien elegido! Hubieses perdido! La puntuación de la máquina es " + sumaMaquina);
	            }


	        }
	    }

}
