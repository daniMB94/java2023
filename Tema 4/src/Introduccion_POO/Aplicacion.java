package Introduccion_POO;

public class Aplicacion {

	public static void main(String[] args) {

		//La información se pasa en el mismo orden
		Coche miCoche = new Coche("Peugeot", "407 Coupé", "rojo", 30000);
		Coche cocheMiTia = new Coche("BMW", "i3", "blanco", 45000);
		
		cocheMiTia.setPrecio(46500);
		
		cocheMiTia.precio=0;
		
		System.out.println(cocheMiTia.pintar());
		System.out.println(miCoche.pintar());
		
		System.out.println(miCoche.getModelo());
		
		System.out.println(cocheMiTia);
		System.out.println(miCoche);
	}

}
