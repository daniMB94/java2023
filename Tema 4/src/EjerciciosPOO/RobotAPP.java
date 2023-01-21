package EjerciciosPOO;

public class RobotAPP {

	public static void main(String[] args) {

		int contador = 0;
		
		Robot R1 = new Robot(1,1, false);
		
		do{
			R1.irDerecha(10);
			System.out.println(R1);
			contador++;
		} while(contador < 10);
		
	}

}
