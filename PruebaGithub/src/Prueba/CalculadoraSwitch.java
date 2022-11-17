package Prueba;

public class CalculadoraSwitch {

	public static void main(String[] args) {

		//Definir char operador '+', '-', '*', '/', '%', 's'
		//Definir operando1, operando2, resultado como doble
		//"Según" el operador que devuelva el resultado con la operación correspondiente
		
		double operando1, operando2, resultado;
		char operador;
		operador = 's';
		operando1 = 3;
		operando2 = 6;
		resultado = 0;
		
		
		switch (operador) {
		case '+':
			resultado = operando1 + operando2;
			break;
		case '-':
			resultado = operando1 - operando2;
			break;
		case '/':
			resultado = operando1 / operando2;
			break;
		case '%':
			resultado = operando1 % operando2;
			break;
		case '*':
			resultado = operando1 * operando2;
			break;
		case 's':
			resultado = Math.sin(operando1);
			break;
		default:
			throw new IllegalArgumentException("Valor inesperado " + operador);
		}
		
		System.out.println(resultado);
		
	}

}
