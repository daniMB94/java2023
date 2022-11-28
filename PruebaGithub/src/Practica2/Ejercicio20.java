package Practica2;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		
		double a = 1, b = 1, d = 1, x;
		
		//1)
		x = 5 * Math.pow(a, 2) * Math.pow(b, 3) + (Math.pow((Math.pow(a, 2)+ Math.pow(b, 2)), 1/2));
		
		//2)
		x = Math.pow((4 * a * Math.pow(b,2)), 1/2);
		
		//3)
		x = (((Math.pow(a, 3) * b) / (2 * a * Math.pow(b, 2))) - Math.pow((12 * Math.pow(d, 4)), 1/2));
		
	}

}
