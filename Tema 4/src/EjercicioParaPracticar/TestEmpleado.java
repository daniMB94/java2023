package EjercicioParaPracticar;

public class TestEmpleado {

	public static void main(String[] args) {
		
		

		Empleado e1;
		Empleado e2;
		e1 = new Empleado();
		e2 = new Empleado("Luisa", "P�rez Lozano", 50, "lperezlozano@correo.com", 2120, 0.19, 0.05, "Contabilidad");
		
		System.out.println(e1);
		System.out.println("El salario neto de " + e1.getNombre() + " " + e1.getApellidos() + " ser� de: " + e1.salarioNeto());
		
		System.out.println("");
		
		System.out.println(e2);
		System.out.println("El salario neto de " + e2.getNombre() + " " + e2.getApellidos() + " ser� de: " + e2.salarioNeto());
	}

}
