package Tema3;

public class MaquinaExpendedoraChuches {
	
	public static void pintarMatrizInt(int matriz[][]) {
		System.out.print("[");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if(j != matriz[i].length-1) {
					System.out.print(", ");
				}
			}
		}
	}

	public static void main(String[] args) {

		//1. crea una matriz de 5 filas por 10 columnas
		//2. rellénala de números aleatorios entre 1 y 20
		//3. suma los valores de las filas de la matriz
		
		
		//ACLARACIONES: Matriz.length me da las filas (matriz[0] son todos los elementos de la fila 0)
		//ACLARACIONES: 
		int matriz[][] = new int[5][10];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <matriz[0].length; j++) { //para la primera fila cuantos elementos hay. siempre se ponen en la posicion 0
				matriz[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		
		pintarMatrizInt(matriz);
		
		int total = 0;
		for(int i = 0; i < matriz.length; i++) {
			total = 0;
			for(int j = 0; j< matriz.length; j++) {
				total += matriz[i][j];
			}
			System.out.println("Total de la fila " + i + " es " + total);
		}
		
	}

}
