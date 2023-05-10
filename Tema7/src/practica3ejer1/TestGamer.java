package practica3ejer1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestGamer {
	
	

	
	public static void main(String[] args) {

		Discord discord = new Discord();
		
		Path uri = Paths.get("C:/Users/usuario1DAW/Documents/Repositorio local GitHub pcClase/Tema7/src/resources/Gamers.txt");

		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		
		while (opcion != 5) {
			System.out.println("***MENU***");
			System.out.println("1.-"+"\t" + "Aniadir jugador");
			System.out.println("2.-"+"\t" + "Eliminar jugador");
			System.out.println("3.-"+"\t" + "Buscar jugador");
			System.out.println("4.-"+"\t" + "Listar informacion");
			System.out.println("5.-"+"\t" + "Salir"+"\n\n");
			System.out.print("Selecciona una opcion: ");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				
				if(discord.loadGamers(uri))
					System.out.println("Jugadores aniadidos correctamente");
				else
					System.out.println("Error al aniadir jugadores");
				

				break;
			}
			case 2: {

				break;
			}
			case 3: {

				break;
			}
			case 4: {
				try {
					System.out.println(discord.listGamers());
				} catch (Exception e) {
					System.out.println("Error al listar la información de los Gamers");
				}
				break;
			}
			case 5: {
				System.out.println("Salir");
				break;
			}
			default:
				throw new IllegalArgumentException("Valor de opcion incorrecto: " + opcion);
			}
			System.out.println("***Programa terminado***");
			System.out.println(discord.toString());
		}

	}

}
