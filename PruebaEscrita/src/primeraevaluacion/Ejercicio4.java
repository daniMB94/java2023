package primeraevaluacion;

import java.util.Scanner;

public class Ejercicio4 {

	public static void pintar(String[][] laberinto, int coord1, int coord2, int coord1Bomba, int coord2Bomba,
			int inicioX, int inicioY, int activador) {
		
		int movimiento = 0;

		
		Scanner sc = new Scanner(System.in);
		if(activador == 0) {
			//Generamos un menú para seleccionar movimiento
			do {
				System.out.println("1. Derecha");
				System.out.println("2. Izquierda");
				System.out.println("3. Abajo");
				System.out.println("4. Arriba");

				try {
					movimiento = Integer.parseInt(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Movimiento incorrecto (1, 2, 3 ó 4)");
				}
				

				switch (movimiento) {
				case 1:
					System.out.println("Derecha");
					inicioX = inicioX +1;
					break;
				case 2:
					System.out.println("Izquierda");
					inicioX = inicioX -1;
					break;
				case 3:
					System.out.println("Abajo");
					inicioY = inicioY +1;
					break;
				case 4:
					System.out.println("Arriba");
					inicioY = inicioY -1;
					break;
				default:
					System.out.println("Movimiento incorrecto (1, 2, 3 ó 4)");
					break;
				}
				//Introducimos el cambio en el tablero y ponemos un Try para capturar la salida y pintar "Game Over"
				
				
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						if (i == inicioY && j == inicioX)
							laberinto[inicioY][inicioX] = "@";
						else {
							if (i == coord1 && j == coord2)
								laberinto[i][j] = "#";
							else {
								if (j == 0 || j == laberinto[0].length - 1) {
									laberinto[i][j] = "|";
								} else if (i == 0 || i == laberinto.length - 1) {
									laberinto[i][j] = "-";
								} else
									laberinto[i][j] = ".";
							}
						}

					}

				}

				//Pintamos el nuevo tablero
				
				for (int i = 0; i < laberinto.length; i++) {
					for (int j = 0; j < laberinto[0].length; j++) {
						System.out.print(laberinto[i][j] + " ");
					}
					System.out.println("");

				}
				
				//La condicion de salida del bucle es o encontrar la salida o encontrar la bomba o que pete el programa
			} while (laberinto[inicioY][inicioX] != laberinto[coord1][coord2] &&
					laberinto[inicioY][inicioX] != laberinto[coord1Bomba][coord2Bomba]);
			
			if(laberinto[inicioY][inicioX] == laberinto[coord1][coord2]) System.out.println("¡Has llegado a la salida!");
			else if(laberinto[inicioY][inicioX] == laberinto[coord1Bomba][coord2Bomba]) System.out.println("Has encontrad la bomba. GAME OVER");
		} else {
			//Introducimos los cambios y pintamos el nuevo tablero
			for (int i = 0; i < laberinto.length; i++) {
				for (int j = 0; j < laberinto[0].length; j++) {
					if (i == inicioY && j == inicioX)
						laberinto[inicioY][inicioX] = "@";
					else {
						if (i == coord1 && j == coord2)
							laberinto[i][j] = "#";
						else {
							if (j == 0 || j == laberinto[0].length - 1) {
								laberinto[i][j] = "|";
							} else if (i == 0 || i == laberinto.length - 1) {
								laberinto[i][j] = "-";
							} else
								laberinto[i][j] = ".";
						}
					}

				}

			}
			for (int i = 0; i < laberinto.length; i++) {
				for (int j = 0; j < laberinto[0].length; j++) {
					System.out.print(laberinto[i][j] + " ");
				}
				System.out.println("");

			}
			
			if(laberinto[inicioY][inicioX] == laberinto[coord1][coord2]) System.out.println("¡Has llegado a la salida!");
			else if(laberinto[inicioY][inicioX] == laberinto[coord1Bomba][coord2Bomba]) System.out.println("Has encontrad la bomba. GAME OVER");
		}
		
		
		}
		

	
	
	public static void maquina(String[][] laberinto, int coord1, int coord2, int coord1Bomba, int coord2Bomba,
			int inicioX, int inicioY, int activador) {
		inicioY = 0;
		inicioX = 0;
		int diferenciaX, diferenciaY;


		diferenciaY =  coord2 - inicioX;
		diferenciaX =  coord1 - inicioY;
		
		while (diferenciaX > 0 || diferenciaY > 0) {
			if(diferenciaX > 0) {
				inicioX = inicioX + 1;
				diferenciaX =  coord2 - inicioX;
			}
			if(diferenciaY > 0) {
				inicioY = inicioY + 1;
				diferenciaY = coord1 - inicioY;
			}
			pintar(laberinto, coord1, coord2, coord1Bomba, coord2Bomba, inicioX, inicioY, activador);
		}
		
	}

	public static void main(String[] args) {

		String laberinto[][] = new String[20][20];

		// Determinamos las coordenadas del inicio
		int inicioX = 0;
		int inicioY = 0;
		//Determinamos las coordenadas de la salida
		int coord1 = 0;
		int coord2 = 0;
		//Determinamos las coordenadas de la bomba
		int coord1Bomba = 0;
		int coord2Bomba = 0;
		//Una variable para activar parte de la funcion "pintar"
		int activador = 0;
		Scanner sc = new Scanner(System.in);
		



		// Generamos aleatoriamente las coordenadas de la salida (solo para los bordes
		// excluyendo la coordenada 0,0)
		do {
			coord1 = (int) (Math.random() * ((laberinto.length - 1) + 1) - 0) + 0;
			coord2 = (int) (Math.random() * ((laberinto[0].length - 1) + 1) - 0) + 0;
		} while (((coord1 != 0 && coord1 != laberinto[0].length - 1) && (coord2 != 0 && coord2 != laberinto.length - 1))
				|| (coord1 == 0 && coord2 == 0));
		// Generamos aleatoriamente las coordenadas de la bomba (únicamente se permite
		// dentro del laberinto excluyendo los bordes)
		do {
			coord1Bomba = (int) (Math.random() * ((laberinto.length - 1) + 1) - 0) + 0;
			coord2Bomba = (int) (Math.random() * ((laberinto[0].length - 1) + 1) - 0) + 0;
		} while ((coord1Bomba != 0 && coord1Bomba != laberinto[0].length - 1)
				&& (coord2Bomba == 0 || coord2Bomba == laberinto.length - 1) || (coord1Bomba == 0 && coord2Bomba == 0)
				|| coord1Bomba == 19 || coord2Bomba == 19 || coord1Bomba == 0 || coord2Bomba == 0);

		System.out.println(coord1Bomba + " - " + coord2Bomba);
		
		// Generamos el tablero usando las coordenadas de inicio "@", las coordenadas de
		// salida "#"

		System.out.println(coord2 + "-" + coord1);

		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				if (i == inicioY && j == inicioX)
					laberinto[i][j] = "@";
				else {
					if (i == coord1 && j == coord2)
						laberinto[i][j] = "#";
					else {
						if (j == 0 || j == laberinto[0].length - 1) {
							laberinto[i][j] = "|";
						} else if (i == 0 || i == laberinto.length - 1) {
							laberinto[i][j] = "-";
						} else
							laberinto[i][j] = ".";
					}
				}

			}

		}

		// Pitamos el tablero inicial
		System.out.println("TABLERO DE JUEGO INICIAL");
		for (int i = 0; i < laberinto.length; i++) {
			for (int j = 0; j < laberinto[0].length; j++) {
				System.out.print(laberinto[i][j] + " ");
			}
			System.out.println("");

		}
		pintar(laberinto, coord1, coord2, coord1Bomba, coord2Bomba, inicioX, inicioY, activador);
		
		System.out.println("Si quieres ver como lo haría la máquina pulsa 1, en caso contrario pulsa 0:");
		
		
		//PONEMOS UN SC PARA METER LA RESPUESTA DEL USUARIO Y LUEGO ACTIVAMOS UNA PARTE DE LA FUNCIÓN PINTAR CON UN "IF"
		//LUEGO PONEMOS LA FUNCION PINTAR DENTRO DE LA FUNCION MAQUINA
		do {
			try {
				activador = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Solo se admite el 1 o el 0");
				activador = 2;
			}
		} while (activador != 0 && activador != 1);
		
		
		if(activador == 1) {
			maquina(laberinto, coord1, coord2, coord1Bomba, coord2Bomba, inicioX, inicioY, activador);
		}
		
		

		System.out.println("Partida terminada");
		
		
	}

}
