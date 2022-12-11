package Practica4;

public class Ejercicio16 {

	public static boolean revisar(int tabla[][], int numero) {
		boolean estar = false;
		int contador = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				if (numero == tabla[i][j])
					contador = contador + 1;
				if (contador >= 2) {
					estar = true;
					j = tabla[0].length;
					i = tabla.length;
				}

			}
		}

		return estar;
	}

	public static void main(String[] args) {

		int tablaAleatorio[][] = new int[3][6];
		int numeroIntroducido;

		for (int i = 0; i < tablaAleatorio.length; i++) {
			for (int j = 0; j < tablaAleatorio[0].length; j++) {
				do {
					numeroIntroducido = (int) (Math.random() * ((100 + 1) - 0)) + 0;
					tablaAleatorio[i][j] = numeroIntroducido;
				} while (revisar(tablaAleatorio, numeroIntroducido) == true);
			}
		}

		System.out.println("La matriz aleatoria sin numeros repetidos es:");
		for (int i = 0; i < tablaAleatorio.length; i++) {
			for (int j = 0; j < tablaAleatorio[0].length; j++) {
				System.out.print(tablaAleatorio[i][j] + ", ");
			}
			System.out.println("");
		}

	}

}
