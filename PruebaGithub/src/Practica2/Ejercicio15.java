package Practica2;

public class Ejercicio15 {

	public static void main(String[] args) {

		
		double cantidad = 2000;
		double interes = 2.75 / 100;
		double retencion = 18d / 100;
		
		double misIntereses, misInteresesRetencion;
		
		misIntereses = cantidad * interes / 2;
		misInteresesRetencion = misIntereses * retencion;
		
		System.out.println(misIntereses + "€ sin retención");
		
		System.out.println("Hacienda se queda " + misInteresesRetencion);
		
		System.out.println("A mi me corresponde " + (misIntereses - misInteresesRetencion)+ "€");
		
		
	}

}
