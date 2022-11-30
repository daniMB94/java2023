package Tema3;

public class EjemploString2 {
	
	//separa los números de una dirección ip 192.168.1.27. Cuando los tengas súmalos

	public static void main(String[] args) {

		String direccionIP = "192.168.1.72";
		
		String op1 = direccionIP.substring(0,direccionIP.indexOf("."));
		String op2 = direccionIP.substring(4,direccionIP.indexOf(".", direccionIP.indexOf(".") + 1));
		String op3 = direccionIP.substring(8,9);
		String op4 = direccionIP.substring(10,12);
		
		System.out.println(op1 + " " + op2 + " " + op3 + " " + op4);
		
		int posicion = 0;
		String num = "";
		int suma = 0;
		while(direccionIP.indexOf(".", posicion) >= 0) {
			num = direccionIP.substring(posicion, direccionIP.indexOf(".",posicion));
			System.out.println(num);
			suma = suma + Integer.parseInt(num);
			posicion = direccionIP.indexOf(".", posicion) + 1;
		}
		
		num = direccionIP.substring(posicion); //saca el último número hasta el final
		System.out.println(num);
		suma = suma + Integer.parseInt(num);
		System.out.println("La suma de los dígitos de la IP es " + suma);
		
	}

}
