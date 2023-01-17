package EjemploTieneUnArrayIMPORTANTE;

public class Aplicacion {

	public static void main(String[] args) {

		Empresa cosentino = new Empresa("Cosentino");
		
		cosentino.contratar(new Empleado("Javi", "Guillen", "jj@gmail.com", "Programador jefe", 3000));
		cosentino.contratar(new Empleado("Lucia", "Guillen", "lj@gmail.com", "Programador jefe", 4000));
		
		System.out.println();
		
		
	}

}
