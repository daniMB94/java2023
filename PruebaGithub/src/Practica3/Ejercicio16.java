package Practica3;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		//bucle que suma cero más cinco (sacará los multiplos de cinco)
		int numero = 100;
		for(int i = 1; i <= numero; i++) {
			if (i%5 == 0) {
				System.out.print("# ");
				i++;
			}
				System.out.print(i + ", ");
		}

		
	}

}
