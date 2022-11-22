package Tema2;

public class Prueba3ControlExcepcion {
	
	public static int dividir(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Divisón por zero");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		
		
		int numero = 5;
		//Excepcion
		//Lo que hay en el bloque try {} se intenta ejecutar
		//Si hay un error se interrumpe el bloque y pasa a ejecutarse lo que hay en el catch
		try {
			
			System.out.println("Voy a intentar hacer una division por cero");
			numero = numero / 0;
			System.out.println("Si llegas aquí es que has podido dividir por cero");
			
		} catch (Exception e) {
			System.out.println("Error división por cero " + e.getMessage());

		} finally {
			System.out.println("Esto se ejecuta"); //esto hace que si o si se ejecutre este bloque tras la excepción
		}
		
		//Convertir un string a entero
		String cadena = "23a";
		int num = 0;
		try {
			num = Integer.parseInt(cadena);
		} catch(Exception e) {
			System.out.println("No se puede convertir la cadena a entero, no es un entero, es otra cosa");
		}
		
		System.out.println(num);
		
		
		
		System.out.println(dividir(3,0));
		
	}

}
