package practica3ejer3;

import java.time.LocalDate;

public class TestFincas {

	public static void main(String[] args) {

		
		DAOFinca df = new DAOFinca();
		DAOLectura dl = new DAOLectura();
		
		System.out.println("FINCAS ORDENADAS POR SUPERFICIE");
		df.getFincasPorSuperficie();
		System.out.println("FINCAS MÁS GRANDES");
		df.getMasGrandes();
		System.out.println("FINCAS POR CIUDAD");
		df.getFincasPorCiudad();
		
		System.out.println("LECTURAS POR CIUDAD");
		dl.getLecturasPorCiudad();
		System.out.println("MAXIMA TEMPERATURA POR CIUDAD");
		dl.getTempMaximaPorFinca();
		System.out.println("MINIMA TEMPERATURA POR CIUDAD");
		dl.getTemperaturaMínimaPorFinca();
		
		dl.deleteLectura(1);
		dl.deleteLectura(2);
		dl.deleteLectura(3);
		dl.deleteLectura(4);
		dl.deleteLectura(5);
		
		dl.grabarDatos();
		
		
		
		
		
	}

}
