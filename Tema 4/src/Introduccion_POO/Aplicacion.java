package Introduccion_POO;

public class Aplicacion {

	public static void main(String[] args) {

		//La informaci�n se pasa en el mismo orden
		Coche miCoche = new Coche("Peugeot", "407 Coup�", "rojo", 30000);
		Coche cocheMiTia = new Coche("BMW", "i3", "blanco", 45000);
		
		cocheMiTia.setPrecio(46500);
	}

}
