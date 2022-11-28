package Practica2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		//int a = 10, b = 3, e = 1, d, e;
		//float x, y;
		//x = a / b;
		//c = a < b && c;
		//d = a + b++;
		//e = ++a - b;
		// y = (float) a / b;
		
		//CORRECCIÓN
		int a = 10, b = 3, e = 1, d; //Se está inicializando la variable "e" y luego se vuelve a declarar una variable "e". Por lo tanto se elimina la última "e" delcarada
		boolean c = false; //hay que declarar una variable booleana "c" y la inicializamos a "false" para poder usarla.
		float x, y;
		x = a / b;
		c = a < b&&c;
		d = a + b++;
		e = ++a - b;
		y = (float) a / b;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		
		
	}

}
