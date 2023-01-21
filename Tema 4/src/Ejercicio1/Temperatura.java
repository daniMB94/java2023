package Ejercicio1;

public class Temperatura {
	
	public Temperatura() {
		super();
	}
	
	double celsiusToFarenheit(double celsius) {
		double farenheit;
		farenheit = (1.8) * celsius + 32;
		return farenheit;
	}
	
	double farenheitToCelsius(double farenheit) {
		double celsius;
		celsius = (farenheit - 32) / 1.8;
		return celsius;
	}
	
}
