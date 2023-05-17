package practica3ejer1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestGamer {
	
	

	
	public static void main(String[] args) {

		Discord discord = new Discord();
		
		Path uri = Paths.get("src/resources/Gamers.txt");

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		//Cargamos los jugadores inicialmente a partir del archivo
		discord.loadGamers(uri);
		System.out.println("Jugadores aniadidos correctamente"  + "\n");

		
		while (opcion != 5) {
			System.out.println("***MENU***");
			System.out.println("1.-"+"\t" + "Aniadir jugador");
			System.out.println("2.-"+"\t" + "Eliminar jugador");
			System.out.println("3.-"+"\t" + "Buscar jugador");
			System.out.println("4.-"+"\t" + "Listar informacion");
			System.out.println("5.-"+"\t" + "Salir"+"\n");
			System.out.print("Selecciona una opcion: ");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				
				discord.addGamer(null);

				break;
			}
			case 2: {
				discord.removeGamer(null);
				break;
			}
			case 3: {
				discord.findGamer(null);
				break;
			}
			case 4: {
				
					System.out.println(discord.listGamers());
				
				break;
			}
			case 5: {
				System.out.println("Salir" + "\n");
				System.out.println("***Programa terminado***");
				break;
			}
			default:
				throw new IllegalArgumentException("Valor de opcion incorrecto: " + opcion  + "\n");
			}
			
		}

	}

}
