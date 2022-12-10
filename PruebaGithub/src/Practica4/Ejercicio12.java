package Practica4;

public class Ejercicio12 {

	public static void main(String[] args) {

		int matrizMarco[][] = new int[8][6];
		
		for(int i = 0; i < matrizMarco.length; i++) {
			for(int j = 0; j < matrizMarco[0].length; j++) {
				if(j == 0 || j == matrizMarco[0].length-1 || i == 0 || i == matrizMarco.length-1) {
					matrizMarco[i][j] = 1;
				} else matrizMarco[i][j] = 0;
			}
		}
		for(int i = 0; i < matrizMarco.length; i++) {
			for(int j = 0; j < matrizMarco[0].length; j++ ) {
				System.out.print(matrizMarco[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
