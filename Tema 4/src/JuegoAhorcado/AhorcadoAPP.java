package JuegoAhorcado;

import java.util.Scanner;

public class AhorcadoAPP {

	public static void main(String[] args) {

		StringBuffer palabrasS = new StringBuffer();
		StringBuffer palabrasSeparadas = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		// La palabra INICIO no se va a usar en el juego
		String palabras;
		String coleccionPalabras[];
		int indexPalabraElegida;
		String input;
		int nIntentos = 7;

		int stop = 0;
		int nPalabras = 0;

		do {
			System.out.print("Escribe una palabra: ");
			palabras = sc.nextLine();
			palabrasS.append(palabras + ",");
			System.out
					.println("Si quieres dejar de escribir palabras pulsa 1. En caso contrario pulsa cualquier numero");
			stop = Integer.parseInt(sc.nextLine());
		} while (stop != 1);

		for (int i = 0; i < palabrasS.length(); i++) {
			if (palabrasS.charAt(i) == ',')
				nPalabras++;

		}

		coleccionPalabras = new String[nPalabras];
		
		indexPalabraElegida = (int) (Math.random() * (nPalabras + 1) - 0);

		nPalabras = 0;

		for (int i = 0; i < palabrasS.length(); i++) {
			if (palabrasS.charAt(i) == ',') {
				nPalabras++;
				palabrasSeparadas.delete(0, i);
			} else {
				palabrasSeparadas.append(palabrasS.charAt(i));
				palabras = palabrasSeparadas.toString();
				coleccionPalabras[nPalabras] = palabras;
			}

		}
		
		ahorcado.setPalabras(coleccionPalabras);

		ahorcado juego = new ahorcado(coleccionPalabras[indexPalabraElegida]);
		
		System.out.println("*** EMPIEZA EL JUEGO ***");
		System.out.println("Instrucciones:");
		System.out.println("- Para probar letra escribe la letra deseada. Ejemplo: 'a'");
		System.out.println("- Para probar a resolver escribe la palabra deseada. Ejemplo: 'RESUELVO:bicicleta'");
		
		do {
			System.out.println("Introduce letra o resuelve");
			input = sc.nextLine();
			if(input == "RESUELVO:bicicleta")
				juego.resolver(input.substring(9));
			else {
				juego.intentar(input.charAt(0));
			//for(int i = 0; i <) PINTAR CON juego.getLetrasSecretas()
			}
				
			
		} while (juego.isResultado() == false && nIntentos <= 7);
		
		if(juego.isResultado() == false)
			System.out.println("Lo sientos. Has perdido");
		else
			System.out.println("¡Has ganado!");

	}

}
