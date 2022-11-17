package Prueba;

public class NotaProgramación {

	public static void main(String[] args) {

		
		double notaPractica, notaExamen, notaFinal;
		
		notaPractica = 2.9;
		notaExamen = 7;
		
		notaFinal = notaExamen * 0.4 + notaPractica * 0.6;
		
		if (notaPractica < 3) {
			System.out.println("Suspenso");
		} else if (notaExamen < 3) {
			System.out.println("Suspenso");
		} else if (notaFinal < 5) {
			System.out.println("Suspenso");
		} else if (notaFinal >= 5 && notaFinal <= 8) {
			System.out.println("Notable");
		} else if (notaFinal > 8) {
			System.out.println("Sobresaliente");
		}
			
		
} }
