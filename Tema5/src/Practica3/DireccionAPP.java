package Practica3;



public class DireccionAPP {

	public static void main(String[] args) {


		
		
		Direccion dir = new Direccion();
		
		//usamos los setters para comprobar que funcionan bien
		
		dir.setCp();
		dir.setLatitud();
		dir.setLongitud();
		dir.setNombreVia();
		dir.setNumero();
		dir.setPais();
		dir.setPoblacion();
		dir.setProvincia();
		dir.setTipoVia();
		

		
		Direccion dir2 = new Direccion();

		 
		 System.out.println("La distania entre las 2 direcciones es: " + dir.distanciaKM(dir2) + "Km");
		
	}

}
