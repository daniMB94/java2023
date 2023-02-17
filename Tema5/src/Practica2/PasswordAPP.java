package Practica2;

public class PasswordAPP {

	public static void main(String[] args) {

		Password p = new Password();
		
		if(p.esFuerte())
			System.out.println(p + "	Es fuerte");
		else
			System.out.println(p + "	No es fuerte");
		
		Password p2 = new Password(15);
		
		if(p2.esFuerte())
			System.out.println(p2 + "	Es fuerte");
		else
			System.out.println(p2 + "	No es fuerte");
	}

}
