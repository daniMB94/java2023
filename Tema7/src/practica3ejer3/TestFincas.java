package practica3ejer3;

public class TestFincas {

	public static void main(String[] args) {

		
		DAOFinca df = new DAOFinca();
		System.out.println("FINCAS ORDENADAS POR SUPERFICIE");
		df.getFincasPorSuperficie();
		System.out.println("FINCAS MÁS GRANDES");
		df.getMasGrandes();
		System.out.println("FINCAS POR CIUDAD");
		df.getFincasPorCiudad();
		
		
		
		
		
		DAOLectura dl = new DAOLectura();
		System.out.println("LECTURAS POR CIUDAD");
		dl.getLecturasPorCiudad();
		

		
		
		
	}

}
