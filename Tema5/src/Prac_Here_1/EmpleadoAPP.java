package Prac_Here_1;

public class EmpleadoAPP {

	public static void main(String[] args) {

		Repartidor r1 = new Repartidor ("Pepe", 24, 1200, "zona 3");
		Repartidor r2 = new Repartidor ("Maria", 26, 1350, "zona 2");
		
		Comercial c1 = new Comercial ("Julia", 40, 1500, 450);
		Comercial c2 = new Comercial ("Luisa", 22, 1150, 150);
		//Pintamos sin ejecutar método PLUS
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("--------------------------------------------------");
		
		r1.plusE();
		r2.plusE();
		c1.plusE();
		c2.plusE();
		//Pintamos tras ejecutar método PLUS
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
