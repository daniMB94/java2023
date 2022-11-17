package Prueba;

public class EjemploSwitch {

	public static void main(String[] args) {

		//int diasSemana 1-7
		//Diga el día de la semana que es (lunes, martes, ...)
		
		int diaSemana = 5;
		
		switch (diaSemana) {
		case 1: {
		 System.out.println("Lunes");
		 break;
		}
		case 2: {
			System.out.println("Martes");
		break;
		}
		case 3: {
			System.out.println("Miércoles");
		break;
		}
		case 4: {
			System.out.println("Jueves");
		break;
		}
		case 5: {
			System.out.println("Viernes");
		break;
		}
		case 6: {
			System.out.println("Sábado");
		break;
		}
		case 7: {
			System.out.println("Domingo");
		break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + diaSemana);
		}
		
	}

}
