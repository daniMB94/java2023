package Prueba;

public class Prueba {

	static int numero = 1;
	
	public static int suma(int a, int b) {
		int mes = 11;
		
		return a+b * numero;
	}
	
	public static void main(String[] args) {


		//Declaración de variables
		//TIPO -> NOMBRE = VALOR POR DEFECTO O INICIAL
		
		short num2 = 9;
		int mes = 12;
		long distancia = 3000000;
		char letra = 'P';
		float decimal = 1e10f;
		double precio = 35000.95;
		
		boolean ganasDeIrme = true;
		
		float flotante = 0.0f;
		double numeroDecimal = 0.0; //decimales (no necsita poner "d" al final del valor)
		
		final double PLUS = 1.15; //constante (el nombre mayúsculas)
		
		long largo2 = (int) 3;
		double grande2 = 5f;
		
		
		System.out.println(num2);
		System.out.println(mes);
		System.out.println(distancia);
		System.out.println(letra);
		System.out.println(decimal);
		System.out.println(precio);
		System.out.println(ganasDeIrme);
		System.out.println(PLUS);
		
	}

}
