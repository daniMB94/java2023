package primeraevaluacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void sutituirVocal(String frase, char vocal) {
		
		for(int i = 0; i < frase.length(); i++) {

				
			}
		}
		
	

	public static void main(String[] args) {

		String vocal = "E";
		String frase;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una frase por teclado: ");
		
		frase = sc.nextLine();
		
		System.out.print("Ahora introduce la vocal que quieras sustituir: ");
		
		vocal = sc.nextLine();
		
		System.out.print("La frase con la vocal sustituida será: ");
		
		if(vocal.equals("a")||vocal.equals("e")||vocal.equals("i")||vocal.equals("o")||vocal.equals("u")||
				vocal.equals("A")||vocal.equals("E")||vocal.equals("I")||vocal.equals("O")||vocal.equals("U")) {
			
		}
		
	}

}
