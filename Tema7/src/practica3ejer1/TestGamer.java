package practica3ejer1;

import java.util.Scanner;

import practica3ejer1.Gamer.Nivel;

public class TestGamer {
	
	/**
	 * Sirve para leer por teclado los atributos del objeto Gamer
	 */
	public static void obtencionDatosGamer(String nick, String email, String juego, String nivel) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce nick: ");
		nick = sc.nextLine();
		System.out.print("Introduce e-mail: ");
		email = sc.nextLine();
		System.out.print("Introduce juego: ");
		juego = sc.nextLine();
		System.out.println("Introduce nivel (DIOS, MAQUINA, BUENO, REGULAR, MALILLO, PAQUETE): ");
		nivel = sc.nextLine();
	}

	public static void main(String[] args) {

		Discord discord = new Discord();
		
		String uri = "./ficheros/Gamers.txt";

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		String nick = null;
		String email = null;
		String juego = null;
		String nivel = null;

		while (opcion != 5) {
			System.out.println("***MENU***");
			System.out.println("1.-"+"\t" + "Aniadir jugador");
			System.out.println("2.-"+"\t" + "Eliminar jugador");
			System.out.println("3.-"+"\t" + "Buscar jugador");
			System.out.println("4.-"+"\t" + "Listar informacion");
			System.out.println("5.-"+"\t" + "Salir");
			switch (opcion) {
			case 1: {
				obtencionDatosGamer(nick, email, juego, nivel);
				try {
					discord.addGamer(new Gamer(nick, email, juego, Nivel.valueOf(nivel)));
					System.out.println("Nuevo gamer aniadido con éxito");
				} catch (Exception e) {
					System.out.println("No se pudo aniadir Gamer. Probablemente se introdujo mal el atributo 'Nivel'");
					System.out.println("Se produjo un error al introducir los atributos");
				}

				break;
			}
			case 2: {
				obtencionDatosGamer(nick, email, juego, nivel);
				try {
					if(discord.removeGamer(new Gamer(nick, email, juego, Nivel.valueOf(nivel))));
						System.out.println("Gamer eliminado correctamente");
				} catch (Exception e) {
					System.out.println("Se produjo un error al introducir los atributos");
				}
				
				break;
			}
			case 3: {
				obtencionDatosGamer(nick, email, juego, nivel);
				try {
					if(discord.findGamer(new Gamer(nick, email, juego, Nivel.valueOf(nivel))))
						System.out.println("Gamer aniadido correctamente");
				} catch (Exception e) {
					System.out.println("Se produjo un error al introducir los atributos");
				}
				
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
		}

	}

}
