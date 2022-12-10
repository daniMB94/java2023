package Practica4;


public class Ejercicio11 {

	public static void main(String[] args) {
		
		int tablaDiagonal[][] = new int[5][5];
		int acumulador = 0;
		
		
		for(int i = 0; i < tablaDiagonal.length; i++) {
			for(int j = 0; j < tablaDiagonal[0].length; j++ ) {
				if(j == acumulador || j == tablaDiagonal.length-1-acumulador) tablaDiagonal[i][j] = 1;
				else tablaDiagonal [i][j] = 0;
			}
			acumulador++;
		}
		
		for(int i = 0; i < tablaDiagonal.length; i++) {
			for(int j = 0; j < tablaDiagonal[0].length; j++ ) {
				System.out.print(tablaDiagonal[i][j] + " ");
			}
			System.out.println("");
		}		
		
	}

}
