package Ejercicio8;

public class IncidenciaAPP {

	public static void main(String[] args) {

		Incidencia inc1 = new Incidencia("Roto el ascenso", "");
		Incidencia inc2 = new Incidencia("Fuga de agua en el quinto b", "");
		
		System.out.println(inc1);
		System.out.println(inc2);
		
		System.out.println(Incidencia.getPendiete());
		
		inc1.setEstado("En proceso");
		inc1.resuelve();
		inc2.resuelve();
		
		System.out.println(Incidencia.getPendiete());
		
	}

}
