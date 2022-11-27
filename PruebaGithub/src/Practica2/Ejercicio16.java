package Practica2;

public class Ejercicio16 {

	public static void main(String[] args) {

		double PI = Math.PI;
		double altura, diametro, area, volumen;
		
		altura = 42.4;
		diametro = 15.5;
		
		area = 2*PI*(diametro/2)*((diametro/2)+altura);
		
		volumen = PI * (diametro/2)*(diametro/2)*altura;
		
		
		System.out.println("El área del cilindro es: " + area);
		System.out.println("El volumen del cilidnro es: " + volumen);
		
		
	}

}
