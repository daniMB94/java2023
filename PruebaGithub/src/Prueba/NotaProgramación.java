package Prueba;

public class NotaProgramación {

	public static void main(String[] args) {

		
		double notaPractica, notaExamen, notaFinal;
		
		notaPractica = 4;
		notaExamen = 7;
		
		notaFinal = notaExamen * 0.4 + notaPractica * 0.6;
		
		if (notaPractica >= 3) {
			
			if (notaExamen >= 3) {
				
				System.out.println(notaFinal);
				
				
			} else {
				System.out.println("Suspenso ");
			} 
		}
		
		if (notaFinal > 5 & notaFinal < 8) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		
	}

}
