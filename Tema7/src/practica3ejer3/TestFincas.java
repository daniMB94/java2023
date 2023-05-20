package practica3ejer3;

public class TestFincas {

	public static void main(String[] args) {

		
		DAOFinca df = new DAOFinca();
		df.getFincasPorSuperficie();
		
		
		//VOLVER A DESCARGAR DE MOKAROO EL ARCHIVO CSV CON EL FORMATO CORRECTO DE FECHA dd/MM/yyyy
		DAOLectura dl = new DAOLectura();
		
		Finca f2 = new Finca("PRUEBA", 1.1, 1.1, 1.1, "PRUEBA", "PRUEBA");
		
		df.addFinca(f2);
		
		
		
	}

}
