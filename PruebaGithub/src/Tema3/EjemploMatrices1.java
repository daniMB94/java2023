package Tema3;

public class EjemploMatrices1 {

	/**
	 * Pintar una matriz de cualquier tamaño de enteros
	 * @param matriz
	 */
	public static void pintarMatrizInt(int matriz[][]) {
		
		for(int i=0; i<matriz.length; i++) {
			System.out.print("[");
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				//Para no pintar la última ,
				if(j != matriz[i].length-1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		// 1. Crea una matriz de 5 filas por 10 columnas
		// 2. Rellénala de números aleatorios entre 1 y 10
		// 3. Suma los valores de las filas de la matriz

		int matriz[][] = new int[5][10];
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		
		pintarMatrizInt(matriz);
		
		int total=0;
		//Suma por filas
		for(int i=0; i<matriz.length; i++) {
			total = 0;
			for(int j=0; j<matriz[0].length; j++) {
				total += matriz[i][j];
			}
			System.out.println("Total de la fila " + i + " es " + total);
		}
	}

}