package EjemploConstructorCopia;

public class RobotAPP {

	public static void main(String[] args) {

		Robot r1 = new Robot();
		
		Robot r2 = new Robot("Rojo", 200, 5, 5);
		Robot r3 = new Robot(r2); //r3 y r2 son iguales pero objetos diferentes
		r3.setPosicionRandom();
		
		Robot r4 = new Robot(r2);
		r4.setPosicion(2, 2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
	}

}
