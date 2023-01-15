package EjerciciosPOO;

public class TemperaturaAPP {

	public static void main(String[] args) {

		Temperatura celsius = new Temperatura();
		System.out.println("Pasar 35 grados celsius a farenheit:");
		System.out.println(celsius.celsiusToFarenheit(35));
		
		System.out.println("");
		
		Temperatura farenheit = new Temperatura();
		System.out.println("Pasar 50 grados farenheit a celsius:");
		System.out.println(farenheit.farenheitToCelsius(50));
		
		
	}

}
