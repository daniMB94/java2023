package practica3ejer1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import practica3ejer1.Gamer.Nivel;

public class TestGamer {
	
	
public static String propiedades() {

	
	Scanner sc = new Scanner(System.in);
	
	System.out.println(
			"Introduce los atributos de Gamer intercalando un ';' y sin usar espacios para especificar nick, email, juego y nivel");
	String prop = sc.nextLine();
	
	sc.close();
	return prop;
}

public static Gamer creadorGamers() {
	List<String> lineas = List.of(propiedades());
	
	return(lineas.stream().map(linea -> {
		String[] atributos = linea.split(";");
		return new Gamer(atributos[0], atributos[1], atributos[2], Nivel.valueOf(atributos[3]));
	}).collect(Collectors.toSet()).stream().findFirst().get());
	
}

	
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
				
				discord.addGamer(creadorGamers());

				break;
			}
			case 2: {
				discord.removeGamer(creadorGamers());
				break;
			}
			case 3: {
				discord.findGamer(creadorGamers());
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
