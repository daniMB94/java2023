package Ejercicio11;

import java.util.Scanner;

public class RobotAPP {

	// Funcion para mintar tablero
	public static void pintarTablero(Robot robot1, int filas, int columnas, String tablero[][]) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i == robot1.getPosicionY() && j == robot1.getPosicionX())
					tablero[i][j] = "R";
				else if (i == 0 || i == filas - 1)
					tablero[i][j] = "-";
				else if (j == 0 || j == columnas - 1)
					tablero[i][j] = "|";
				else
					tablero[i][j] = ".";
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int filas, columnas, salidaX, salidaY, direccion, error = 0, pasosParaSalir;

		// do while para establecer un numero de filas con try catch por si se introduce
		// algo distinto a numeros
		do {
			try {
				System.out.print("Determina el tamaño del tablero. Introduce las filas: ");
				filas = Integer.parseInt(sc.nextLine());
				Robot.setFILASTABLERO(filas);
				System.out.println();

				error = 1;

			} catch (Exception e) {
				error = 0;
			}
		} while (error != 1);

		// do while para establecer un numero de columnas con try catch por si se
		// introduce algo distinto a numeros
		do {
			try {
				System.out.print("Determina el tamaño del tablero. Introduce las columnas: ");
				columnas = Integer.parseInt(sc.nextLine());
				Robot.setCOLUMNASTABLERO(columnas);
				System.out.println();

				error = 1;

			} catch (Exception e) {
				error = 0;
			}
		} while (error != 1);

		// Introducimos la dimension a la matriz tablero a partir de los getters donde
		// hemos almacenado la propiedad estática
		String tablero[][] = new String[Robot.getFILASTABLERO()][Robot.getCOLUMNASTABLERO()];

		// Establecemos que los pasos para escapar serán el doble del número de
		// elementos
		// de la matriz
		pasosParaSalir = 2 * (Robot.getFILASTABLERO() + Robot.getCOLUMNASTABLERO());

		// Creamos el robot con el constructor y le psamos la posicion inicial
		Robot robot1 = new Robot(0, 0);

		System.out.println("Columnas" + tablero[0].length);
		System.out.println("Filas" + tablero.length);

		// Establecemos las coordenadas para la salida
		do {
			salidaX = (int) (Math.random() * ((tablero[0].length - 1) + 1) - 0) + 0;
			salidaY = (int) (Math.random() * ((tablero.length - 1) + 1) - 0) + 0;
		} while (salidaY == robot1.getPosicionY() && salidaX == robot1.getPosicionX());

		System.out.println("La salida está en la fila " + salidaY + " y en la columna " + salidaX);

		System.out.println("Tienes " + pasosParaSalir + " pasos para encontrar la salida (no podrás salirte del tablero)");

		// Pintamos el tablero inicial

		pintarTablero(robot1, Robot.getFILASTABLERO(), Robot.getCOLUMNASTABLERO(), tablero);

		// Creamos un menú para ir eligiendo el movimiento
		do {
			System.out.println("1: DERECHA");
			System.out.println("2: IZQUIERDA");
			System.out.println("3: ARRIBA");
			System.out.println("4: ABAJO");

			try {
				direccion = Integer.parseInt(sc.nextLine());
				switch (direccion) {
				case 1:
					robot1.irDerecha(Robot.getCOLUMNASTABLERO() - 1);
					break;
				case 2:
					robot1.irIzquierda(0);
					break;
				case 3:
					robot1.irArriba(0);
					break;
				case 4:
					robot1.irAbajo(Robot.getFILASTABLERO() - 1);
					break;
				default:
					System.out.println("Introduce algún número de la lista");
				}
			} catch (Exception e) {
				System.out.println("Solo puedes introducir números");
			}

			pintarTablero(robot1, Robot.getFILASTABLERO(), Robot.getCOLUMNASTABLERO(), tablero);

			// La condicion de salida es o sobre pasar el nº de pasos o encontrar la salida
		} while (robot1.getnPasos() <= pasosParaSalir
				&& (robot1.getPosicionY() != salidaY || robot1.getPosicionX() != salidaX));

		if (robot1.getPosicionX() == salidaX && robot1.getPosicionY() == salidaY) {
			robot1.setHaLlegado(true);
			System.out.println("Has encontrado la salida");
			System.out.println("Has necesitado " + robot1.getnPasos() + " pasos");
		} else {
			System.out.println("Lo siento no has encontrado la salida");
			System.out.println("La salida era la interseccion de la " + salidaY + "º fila y " + salidaX + "º columna");
		}
		sc.close();
	}
}
